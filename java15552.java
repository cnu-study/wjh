import java.io.*;
import java.util.StringTokenizer;

public class java15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter a = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(b.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(b.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            a.write(String.valueOf(A+B)+"\n");
        }
        a.flush();

    }

}
