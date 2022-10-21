package Base;

public class StaticTest {

    /**
     * 静态变量：类变量
     */
    static int[] a = new int[6];


    /**
     * 非静态变量：实例变量（成员变量）
     */
    int[] b = new int[6];

    /**
     * 局部变量
     */
    public void function() {
        int[] c = new int[6];
    }
    public static void main(String arg[]) {
        System.out.println(a[0]);
    }
}
