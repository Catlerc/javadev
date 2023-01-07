package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus2035 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int x = in.nextInt();
        int y = in.nextInt();
        int c = in.nextInt();

        if (c > x + y)
            out.println("Impossible");
        else {
            int min = Math.min(x, y);
            if (c < min)
                out.println("0 " + c);
            else if ((c - min) <= y) {
                out.println(min + " " + (c - min));
            } else {
                out.println((c - min) + " " + min);
            }
        }
        out.flush();
    }
}
