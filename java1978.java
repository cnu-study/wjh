import java.util.Scanner;

public class java1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int g = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            int count = 0;
            if (a[i] != 1) {
                for (int j = 2; j < a[i]; j++) {
                    if (a[i] % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    g++;

                }
            }

        }
        System.out.println(g);
    }
}
