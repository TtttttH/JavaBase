package DesignModule.ProxyModule.StaticProxy;

public class SmsProxy {
    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    public void send() {
        System.out.println("before send");
        smsService.send();
        System.out.println("after send");
    }
}
