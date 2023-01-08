package lr8.task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        var sogl = "бвгджзйклмнпрстфхцчшщ";

        var inFile = new FileInputStream("./src/lr8/task3/in.txt");
        var outFile = new FileWriter("./src/lr8/task3/out.txt");
        var in = new Scanner(inFile);
        int lineCounter = 0;
        while (in.hasNextLine()) {
            lineCounter++;//считаем с первой строки
            outFile.write("// Строка:" + lineCounter + "\n");
            var line = in.nextLine();
            var words = line.split(" ");
            var soglWordsCounter = 0;
            for (String word : words) {
                if (Objects.equals(word, "")) continue;
                if (sogl.indexOf(word.toLowerCase().charAt(0)) != -1) {
                    soglWordsCounter++;
                    outFile.write(word + "\n");
                }
            }
            outFile.write("// Кол-во слов в строке:" + soglWordsCounter + "\n\n\n");
        }
        inFile.close();
        outFile.close();
    }
}
