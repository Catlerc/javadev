package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int mat2 = b - b2;
        int mat1 = b3 - mat2 - b2;

        out.println(mat1 + " " + mat2);

        out.flush();
    }
}
