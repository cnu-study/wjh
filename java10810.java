import java.util.Scanner;

public class java10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a [] =new int[N];
        for (int  p = 0; p < N ; p++) {
            a[p] = 0;

        }

        for (int q = 0; q < M;  q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();



        for (int s = i-1; s <j; s++) {
            a[s]=k;

        }
    }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i]+" ");

        }
}}
