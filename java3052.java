import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.*;

public class java3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i <10 ; i++) {
            a[i] = sc.nextInt();
            a[i] = a[i]%42;
        }
        HashSet<Integer> b = new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            b.add(a[i]);
        }
        System.out.println(b.size());

    }
}
