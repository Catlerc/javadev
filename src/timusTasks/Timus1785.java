package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a=in.nextInt();

        if (a<=4) out.print("few");
        else if (a<=9) out.print("several");
        else if (a<=19) out.print("pack");
        else if (a<=49) out.print("lots");
        else if (a<=99) out.print("horde");
        else if (a<=249) out.print("throng");
        else if (a<=499) out.print("swarm");
        else if (a<=999) out.print("zounds");
        else out.print("legion");

        out.flush();
    }
}
