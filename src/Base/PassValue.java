package Base;

/**
 * Java 只使用值传递,
 */
public class PassValue {
    String name;
    int x;

    Person person;
    public PassValue (String name, int x) {
        this.name = name;
        this.x = x;
    }
    public static void swap(PassValue a, PassValue b) {
        //这里形参的a，b传输的是实参的地址，和实参都指向同一个对象，对其引用的对象成员变量修改会影响实参
//        String temp = a.name;
//        a.name = b.name;
//        b.name = temp;
//
//        int tempX = a.x;
//        a.x = b.x;
//        b.x = tempX;

        //这里直接对形参进行互换
        PassValue temp = a;
        a = b;
        b = temp;
        a.person = new Person("A");
        b.person = new Person("B");
        System.out.println("a.name:"  + a.name + "|| a.x :" + a.x);
        System.out.println("b.name:"  + b.name + "|| b.x :" + b.x);
    }

    public static void main(String[] args) {
        PassValue a = new PassValue("Hao", 1);
        PassValue b = new PassValue("Hui", 2);
        swap(a, b);
        System.out.println("a.name:"  + a.name + "|| a.x :" + a.x + "|| a.Person: " + a.person.name);
        System.out.println("b.name:"  + b.name + "|| b.x :" + b.x + "|| b.Person: " + b.person.name);
    }
}

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
}
