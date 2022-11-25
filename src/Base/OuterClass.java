package Base;

/**
 * Java 内部类
 * 内部类仍然是一个独立的类，在编译后会产生独立的.class文件：OuterClass$InnerClass.class
 * 每个内部类都能独立地继承一个接口的实现，无论外层是否已经继承了某个接口的实现，对于内部类来说都没有影响，这使得多重继承的解决方案变得完整。
 */
public class OuterClass {
    private int priVal;
    static int staticVal;

    private void outerMethod() {
        System.out.println("this is a private outerMethod");
    }

    //静态内部类
    static class InnerStaticClass {
        public void innerMethod() {
            staticVal = 10;
            System.out.println(staticVal);
        }
    }

    //成员内部类
    class InnerClass {
        public void innerMethod() {
            priVal = 10; //Jdk1.8 之后 内部类可以直接访问类的私有属性
            System.out.println("inner method:" + priVal);

            OuterClass.this.outerMethod(); //调用外部的同名方法时使用外部类名+this+方法名
            outerMethod(); //调用内部类同名方法
        }

        private void outerMethod() {
            System.out.println("this is a private innerMethod");
        }
    }
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        InnerClass inner = out.new InnerClass(); //外部类要访问内部类的成员，必须要建立内部类的对象
        inner.innerMethod();

        InnerStaticClass staticInner = new OuterClass.InnerStaticClass();
    }
}
