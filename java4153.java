import java.util.Arrays;
import java.util.Scanner;

public class java4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            int a[] = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

            if (a[0] == 0 && a[1] == 0 && a[2] == 0) {
                break;
            } else {
                Arrays.sort(a);
                if (a[0] * a[0] + a[1] * a[1] == a[2] * a[2]) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}