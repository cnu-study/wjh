import java.util.Scanner;

public class java10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a [] = new int[N];
        for (int i = 0; i < N ; i++) {
            a[i]=i+1;
            
        }
        for (int p = 0; p < M; p++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int c;
            c=a[i-1];
            a[i-1]=a[j-1];
            a[j-1]=c;

            
        }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i]+" ");

        }

    }
}
