package Base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;

/**
 * Java反射
 */
public class ReflectTest {
    /**
     * object.newInstance() 实际上调用了无参构造方法，所以必须保证类存在无参构造方法
     */

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //通过反射机制，获取Class，通过Class来实例化对象
        //forName() 方法会导致类加载，执行类的静态代码块
        Class c = Class.forName("Base.Address");

        Object obj = c.newInstance();
        System.out.println(obj);

        //Field 类获取类的属性
        /**
         * getFields() 返回类中public修饰的属性
         * getDeclaredFields() 返回类中所有的属性
         * getDeclaredField("") 返回指定属性
         */
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        Field nameField = c.getDeclaredField("name");
        Field privateNameField = c.getDeclaredField("privateName");//私有属性不能直接set，需要打破封装
        nameField.set(obj, "Sheffield");

        //打破私有属性封装
        privateNameField.setAccessible(true);
        privateNameField.set(obj, "privateSheffield");
        System.out.println(nameField.get(obj));
        System.out.println(privateNameField.get(obj));

        // Method类，反射获取类的方法
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        // Constructor类，反射获取类的构造方法
    }
}
