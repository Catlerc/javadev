package lr8.task2;

import java.io.*;
import java.util.Scanner;

// Создать проект, позволяющий из одного, предварительно
//созданного программными средствами файла, переписать данные,
//соответствующие условию - в исходном файле содержится две строки в
//формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
//вторую строку и положительные числа.


public class Task2 {
    public static void main(String[] args) throws IOException {
        var inFile = new FileInputStream("./src/lr8/task2/in.txt");
        var outFile = new FileWriter("./src/lr8/task2/out.txt");
        var in = new Scanner(inFile);
        in.nextLine();//skip one line
        outFile.write(in.nextLine()+"\n");
        for (int i = 0; i < 5; i++) {
            var n=in.nextInt();
            if(n>=0) outFile.write(n+" ");
        }
        outFile.close();
    }
}
