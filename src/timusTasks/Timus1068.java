package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = in.nextInt();

        int sum=0;
        if (n>0)
            for (int i = 1; i <=n ; i++) sum += i;
        else
            for (int i = n; i <=1 ; i++) sum += i;

        out.println(sum);

        out.flush();
    }
}
