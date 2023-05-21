import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Long.reverse;

public class java10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList <Integer> a = new ArrayList<>();
        for (int q = 0; q < N ; q++) {
            a.add(q+1);
        }
        int M = sc.nextInt();
        for (int p = 0; p<M; p++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            Collections.reverse(a.subList(i-1,j));

        }
        for (int i = 0; i < N; i++) {
            System.out.print(a.get(i)+" ");

        }


    }
}
