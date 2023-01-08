package lr8.task1.example3;


import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class Example3 {

    public static void readAllByBytes(InputStream in) throws IOException {
        var buff = new byte[5];
        while (true) {
            var count = in.read(buff);
            if (count != -1)
                System.out.println("количества=" + count + ", buff=" + Arrays.toString(buff) + ", str=" + new String(buff, 0, count, "cp1251"));
            else {
                System.out.println("\nend");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        var fileName = "./src/lr8/task1/example3/text.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);

            readAllByBytes(inFile);
        } catch (IOException e) {
            System.out.println("ошибка отктия-закрытия файла " + fileName + e);
        } finally {
            if (inFile != null) try {
                inFile.close();
            } catch (IOException ignore) {
            }
        }
    }
}
