import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        int[] check = new int[1011];

        for (int i = 6; i <= 1000; i++) {
            int sum = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (j != i / j) {
                        sum += i / j;
                    }
                }
            }
            if (sum == i) check[i] = 1;
        }

        Scanner sc = new Scanner(new File(args[0]));
        PrintWriter out = new PrintWriter(new File(args[1]));

        while (sc.hasNextInt()) {
            int stt = sc.nextInt();
            int num = sc.nextInt();
            if (num<=1000){
            for (int i = 6; i <= num; i++) {
                if (check[i] == 1) {
                    out.print(i + " ");
                }
            }
            out.println();
        }
        }

        sc.close();
        out.close();
    }
}
