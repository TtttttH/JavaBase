package Base;

import java.math.BigDecimal;

public class BigDecimalDemo {


    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = BigDecimal.valueOf(1.2);
        System.out.println(a.compareTo(b));
        System.out.println(a);
        System.out.println(b);
    }
}
