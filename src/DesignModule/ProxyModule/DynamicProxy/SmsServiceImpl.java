package DesignModule.ProxyModule.DynamicProxy;

public class SmsServiceImpl implements SmsService{
    @Override
    public void send(String message) {
        System.out.println("send message" + message);
    }
}
