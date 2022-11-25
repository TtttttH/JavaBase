package Base.IO.NIO;

import java.nio.IntBuffer;

public class BasicBuffer {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(5); //创建一个buffer，存放5个int

        for (int i = 0; i < 5; i ++) {
            intBuffer.put(i * 2);
        }

        intBuffer.flip(); //读写切换
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
