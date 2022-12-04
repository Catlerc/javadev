package lr1.timus;

import java.io.PrintWriter;
import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1293
public class task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res  = a*b*c*2;

        out.println(res);
        out.flush();
    }}
