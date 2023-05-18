import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class java5997_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> l = new ArrayList();
        for (int i = 0; i < 28; i++) {
            l.add(i);

        }
        int a[] = new int[2];
        List<Integer> b = new ArrayList();
        for (int i = 1; i <= 30; i++) {
            if(!l.contains(i)){
                b.add(i);
            }
        }

        a[0]=b.get(0);
        a[1]=b.get(1);
        Arrays.sort(a);
        System.out.print(a[0]);
        System.out.print(a[1]);
    }
    
}
