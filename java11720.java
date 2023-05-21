import java.util.Arrays;
import java.util.Scanner;

public class java11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();
        int sum=0;
        int b [] = new int[N];
        for (int i = 0; i < N; i++) {
            b[i]= a.charAt(i)-'0';
            sum+=b[i];
        }
        System.out.println(sum);
    }
}
