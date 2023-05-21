import java.util.Scanner;

public class java2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String a= "";
        String b= "";
        for (int i = A.length()-1; i >=0; i--) {
            a = a + A.charAt(i);
            b = b + B.charAt(i);

        }
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        if(c>d){
            System.out.println(c);
        }
        else{
            System.out.println(d);
        }

    }
}
