package lr8.task1.example6;


import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null; // можно сразу записать FileReader in=null;
        Writer out = null; // можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("./src/lr8/task1/example6/MyFile1.txt"); // файл для чтения
            out = new FileWriter("./src/lr8/task1/example6/MyFile2.txt", true); // файл для записи

            //разрешено добавление
// Данные считываются и записываются побайтно, как и для
// InputStream/OutputStream
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
// out.write((char)oneByte); // запись с уничтожением ранее
// существующих данных
                out.append((char) oneByte); // запись с добавлением данных в конец
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! "+e);
        } finally {
            in.close();
            out.close();
        }
    }
}