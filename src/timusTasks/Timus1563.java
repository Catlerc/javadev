package timusTasks;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Timus1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        HashSet<String> set = new HashSet<>();

        int n = in.nextInt();

        int bayans = 0;
        for (int i = 0; i <= n; i++) {
            String name = in.nextLine();
            if (set.contains(name))
            {
                bayans++;
            }
            else
                set.add(name);

        }
        out.println(bayans);

        out.flush();
    }
}
