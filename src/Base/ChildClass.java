package Base;

public class ChildClass extends FatherClass{
    static {
        System.out.println("Child static code block");
    }

    {
        System.out.println("Child non-static code block");
    }

    public ChildClass() {
        super();
        System.out.println("Child Construction");
    }

    @Override
    public void pubFunc() {
        System.out.println("Child public function");
    }


//    @Override  子类无法继承父类的私有方法
//    private void priFunc()

    @Override
    protected void protFunc() {
        System.out.println("Child protected function");
    }

    public static void main(String[] args) {
        System.out.println("Child main");
        ChildClass test1 = new ChildClass();
        ChildClass test2 = new ChildClass();
    }
}
