import java.util.Scanner;

public class java11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum=0;
        for (int i = 0; i < N; i++) {
           int a = sc.nextInt();
           sum+=a;
        }
        System.out.println(sum);
    }
}
