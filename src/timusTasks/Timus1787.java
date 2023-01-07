package timusTasks;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Timus1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        int stuck = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            stuck = Math.max(stuck + a - k, 0);
        }
        out.println(stuck);


        out.flush();
    }
}
