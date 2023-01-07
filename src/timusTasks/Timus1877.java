package timusTasks;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Timus1877 {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int l1 = in.nextInt();
        int l2 = in.nextInt();

        boolean yes = false;

        for (int code = 0; code < 9999; code++) {
            if (code % 2 == 0) {
                if (code == l1) {
                    yes = true;
                    break;
                }
            } else {
                if (code == l2) {
                    yes = true;
                    break;
                }
            }
        }
        if (yes)
            out.println("yes");
        else
            out.println("no");


        out.flush();
    }
}
