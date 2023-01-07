package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus1935 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = in.nextInt();

        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            sum += number;
            max = Math.max(max, number);
        }
        out.println(sum + max);
        out.flush();
    }
}
