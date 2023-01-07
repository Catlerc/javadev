package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (b == 1 || c == 1 || b == 0)
            out.println(a - b - c);
        else
            out.println(a - b * c);

        out.flush();
    }
}
