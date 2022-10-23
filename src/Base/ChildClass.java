package Base;

public class ChildClass extends FatherClass{
    /**
     * 1.Java静态代码块中的代码会在类加载JVM时被执行，且只被执行一次
     * 2.静态块常用来执行类属性的初始化
     * 3.静态块优先于各种代码块以及构造函数，如果一个类中有多个静态代码块，会按照书写顺序依次进行
     * 4.静态代码块不能放在方法体中
     * 5.静态代码块不能访问实例变量
     */
    static {
        System.out.println("Child static code block");
    }

    {
        System.out.println("Child non-static code block");
    }

    int x;
    public ChildClass() {
        // super(); //有父类的子类在初始化时，父类的构造方法也会执行，且优先于子类的构造方法，因为每一个子类的构造函数中的第一行都有默认的隐式语句super();
        // 如果在这里引用另外一个子类构造函数会发生错误，因为会调用两次父类构造方法
        this(10);
        System.out.println("Child Construction");
//        super(); // super() or this() must be first statement in  constructor body
    }

    public ChildClass(int x) {
        this.x = x;
    }

    @Override
    public void pubFunc() {
        super.pubFunc();
        System.out.println("Child public function");
    }


//    @Override  子类无法继承父类的私有方法
//    private void priFunc()

    @Override
    protected void protFunc() {
        super.protFunc(); //调用父类方法
        System.out.println("Child protected function");
    }

    public static void func() {
        System.out.println("static func");
    }

    public static void main(String[] args) {
        //this.func() 不可以使用this，this指代实体，不能指代类
        func();
        System.out.println("Child main");
        ChildClass test1 = new ChildClass();
        test1.pubFunc();
    }
}
