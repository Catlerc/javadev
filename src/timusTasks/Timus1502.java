package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus1502 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        out.println((long) n * (n + 1) * (n + 2) / 2);

        out.flush();
    }
}
