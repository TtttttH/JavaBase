package Base;

/**
 * hashcode() 和 equals()方法的重写原则
 * tips: hashcode()仅在使用散列表的时候有用
 */
public class HashEqualTest {
    String name;
    int x;
    /**
     * hashcode()方法重写的原则
     * 1.同一个对象多次调用hashcode()方法应该返回相同的值
     * 2.当两个对象通过equals()方法比较返回true时,hashcode()方法也必须返回相等的值
     * 3.对象中用作equals()方法比较标准的类成员变量都应该加入到hashcode的计算中
     */

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + x;

        return result;
    }

    /**
     * equals()方法原则
     * 1.对称性 a.equals(b), 则b.equals(a);
     * 2.反射性 a.equals(a) == true;
     * 3.传递性 a.equals(b) == true, b,equals(c) == true => a.equals(c) == true;
     * 4.一致性 a.equals(b) == true, 若a,b不变，则a.equals(b) 始终为true
     * 5.非空性 a.equals(null) == false
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) return false; //非空性
        if (o == this) return true; //反射性
        if (!(o instanceof HashEqualTest)) return false;

        HashEqualTest hashEqualTest = (HashEqualTest) o;

        return hashEqualTest.name.equals(this.name) && hashEqualTest.x == this.x;
    }
}
