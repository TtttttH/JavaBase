package DesignModule.ProxyModule.DynamicProxy;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //目标类的类加载
                target.getClass().getInterfaces(), // 代理类需要实现的接口，可指定多个接口
                new DebugInvocationHandler(target) //代理对象对应的自定义 InvocationHandler
        );
    }
}
