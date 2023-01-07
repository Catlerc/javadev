package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus1000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        out.print(in.nextInt() + in.nextInt());

        out.flush();
    }
}
