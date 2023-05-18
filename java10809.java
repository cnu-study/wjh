import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class java10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String abc [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};


        for (int i = 0; i < abc.length; i++) {
            if(S.contains(abc[i])){
                for (int j = 0; j < S.length(); j++) {


                    if(S.charAt(j)==(abc[i]).charAt(0)){
                        System.out.print(j+" ");
                        break;
                    }
                }
            }
            else{
                System.out.print(-1+" ");
            }


        }


    }
}
