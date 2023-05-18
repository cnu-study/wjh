import java.util.Scanner;

public class java5597_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[31];
        for (int i = 1; i <= 28; i++) {
            a[sc.nextInt()] = 1;

        }


        for (int i = 1; i <= 30; i++) {
            if(a[i]!=1){
                System.out.println(i);

            }
        }

    }
}
