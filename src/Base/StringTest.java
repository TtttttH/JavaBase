package Base;

/**
 * String 的==和equals方法相关
 */
public class StringTest {
    public static void main(String[] args) {
        String s5 = new String("hello");
        String s3 = "he" + "llo";  //JVM会先作拼接判断
        String s1 = "hello"; //JVM存入字符串常量区
        String s2 = "hello"; //JVM判断字符串是否已在字符串常量区创建，如果有则直接赋值不再创建

        //这里使用了new创建字符串对象，JVM会先判断字符串常量区有没有这个对象，如果有则直接在堆区创建一个字符串对象，没有的话则先在
        //字符串常量区创建对象，然后再在堆区创建一个字符串对象，将字符串对象的地址返回赋给引用
        String s4 = "he" + new String("llo");

        System.out.println("s1 == s2:" + (s1 == s2)); // true
        System.out.println("s1 == s3:" + (s1 == s3)); // true
        System.out.println("s1 == s4:" + (s1 == s4)); // false
        System.out.println("s1 == s5:" + (s1 == s5)); //false
        System.out.println("s4 == s5:" + (s4 == s5)); //false
        System.out.println("s1.equals(s5):" + (s1.equals(s5))); //true
    }
}
