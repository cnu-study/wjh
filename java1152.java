import java.util.Scanner;

public class java1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        String a[] = M.split(" ");
        if (a[0].equals(" ")||a[a.length].equals(" ")) {
            System.out.println(a.length-1);
        }
        else {
            System.out.println(a.length);
        }
    }
}
