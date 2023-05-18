import java.util.Arrays;
import java.util.Scanner;

public class java1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (double)a[i]/a[N - 1]*100;


        }
        System.out.println(sum / N);
    }
}
