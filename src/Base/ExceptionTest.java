package Base;

/**
 * 用来进行一些异常的函数执行测试
 */
public class ExceptionTest {
    public void funciton() throws Exception{
        try {
            int i = 1/0; //create a Exception scenario
        } catch (Exception e) {
            throw new Exception("catch Exception");
        } finally {
            System.out.println("finally");
        }
    }


    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();
        try {
            test.funciton();
        } catch (Exception e) {
            System.out.println("catch Exception in main");
        }

        System.out.println("finish");
    }
}
