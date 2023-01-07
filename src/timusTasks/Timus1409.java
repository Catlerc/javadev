package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int g = in.nextInt();
        int l = in.nextInt();
        int t = g + l;
        if (t > 10)
            t = 10;
        else
            t -= 1;

        int rg = t - g;
        int rl = t - l;
        out.println(rg + " " + rl);

        out.flush();
    }
}
