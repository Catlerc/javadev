package timusTasks;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Timus1723 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        String str = in.nextLine();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char chr: str.toCharArray()) {
            if (map.containsKey(chr))
                map.put(chr, map.get(chr)+1);
            else
                map.put(chr, 1);
        }
        char megaChar = '1';
        int megaCharPower =0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue()>megaCharPower) {
                megaCharPower = entry.getValue();
                megaChar=entry.getKey();
            }
        }
        out.println(megaChar);

        out.flush();
    }
}
