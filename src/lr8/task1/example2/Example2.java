package lr8.task1.example2;


import java.io.*;
import java.net.URL;

public class Example2 {
    public static void readAllByBytes(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1)
                System.out.println((char) oneByte);
            else {
                System.out.println("\nend");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        var inFile = new FileInputStream("./src/lr8/task1/example2/text.txt");
        readAllByBytes(inFile);
        System.out.println("\n\n");
        inFile.close();

        var inUrl = new URL("http://example.com").openStream();
        readAllByBytes(inUrl);
        System.out.println("\n\n");
        inFile.close();

        var inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
        readAllByBytes(inArray);
        System.out.println("\n\n");
        inFile.close();

    }
}
