package timusTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus1910 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int l = in.nextInt();
        int[] arr = new int[l];
        int maxS=0;
        int maxIndex=0;
        for (int i = 0; i < l; i++) {
            arr[i]=in.nextInt();
            if (i>=2)
            {
                int s = arr[i-2]+arr[i-1]+arr[i];
                if (s>maxS)
                {
                    maxS=s;
                    maxIndex=i;
                }
            }
        }

        out.print(maxS+" "+maxIndex);


        out.flush();
    }
}
