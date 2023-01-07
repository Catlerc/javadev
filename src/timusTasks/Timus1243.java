package timusTasks;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Timus1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        int d = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            if (number <= k) d += (k - number);
            else b += (number - k);

        }
        out.println(b + " " + d);

        out.flush();
    }
}
