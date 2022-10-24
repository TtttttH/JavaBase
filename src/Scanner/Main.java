package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t];
        for (int i = 0; i < t; i ++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j ++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            res[i] = arr[k - 1];
        }

        for (int i = 0; i < t; i++) {
            System.out.print(res[i] + " ");
        }
//        int a, b;
//        while (sc.hasNext()) {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            System.out.println(a + b);
//        }
//        String str1 = sc.next();
//        String str2 = sc.nextLine();
//        System.out.println(str1);
//        System.out.println(str2);
    }
}
