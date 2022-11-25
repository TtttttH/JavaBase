package Base;

/**
 * 抽象类不可以被final修饰
 */
public abstract class AbstractTest {
//    public final abstract String method2(); 抽象方法也不可以被final修饰
    public abstract String method2();

    public final int method3() { //非抽象方法可以用final
        return 3;
    }
    public void method1() {
        System.out.println("1");
    }

    public String method1(int a) {
        return "1";
    }

    public void method1(int a, int b) {

    }
}
