package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;


public class Timus2056 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = in.nextInt();
        int sum = 0;
        int fives = 0;
        int threes = 0;
        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            sum += number;
            if (number == 5) fives++;
            if (number == 3) threes++;
        }

        if (threes > 0)
            out.println("None");
        else if (fives == n)
            out.println("Named");
        else if ((float) sum / n >= 4.5f)
            out.println("High");
        else out.println("Common");


        out.flush();
    }
}
