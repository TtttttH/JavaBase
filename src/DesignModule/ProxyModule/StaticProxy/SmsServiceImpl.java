package DesignModule.ProxyModule.StaticProxy;

public class SmsServiceImpl implements SmsService{
    @Override
    public void send() {
        System.out.println("send message");
    }
}
