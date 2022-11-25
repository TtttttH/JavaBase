package Base.Collections.List;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i ++) {
            list.add(i);
        }

        /**
         * 使用迭代器，如果是并发操作情况下，需要对iterator加锁
         */
        Iterator<Integer> iterator = list.iterator();
        for (int i = 0; i < 9; i ++) {
            int num = iterator.next();
            if (num > 5) {
                iterator.remove();
            }
        }
    }
}
