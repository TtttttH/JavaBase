package Base;

/**
 * 匿名内部类
 * 匿名内部类不能是抽象类，因为系统在创建匿名内部类的时候，会立即创建内部类的对象
 * 匿名内部类不定义构造器
 */
public class AnonymousClassTest {
    public static void main(String[] args) {
        Kid kid = new Kid() {
            @Override
            public void say() {
                System.out.println("this is a Anonymous class method");
            }
        };

//        kid1.say();
        kid.say();

        //自定义方法调用, 不可以使用对象.方法调用，只能在new的时候直接调用
        new Kid() {
            @Override
            public void say() {
                System.out.println("this is another Anonymous class method");
            }

            public void speak() {
                System.out.println("this is a custom method");
            }
        }.speak();
    }
}

interface Kid {
    public void say();
}