import java.util.Scanner;

public class java10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            String b [] =  a.split(",");

            int v=Integer.parseInt(b[0]);
            int w=Integer.parseInt(b[1]);
            System.out.println(w+v);

            }

        }
    }

