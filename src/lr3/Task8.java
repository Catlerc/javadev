package lr3;

import java.util.Scanner;

/*
Напишите программу, в которой создается символьный массив из
10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные (то есть
гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном
окне.
 */
public class Task8 {
    public static void main(String[] args) {
        int size = 10;
        char[] chars = new char[size];
        int i = 0;
        int added = 0;
        String glas="AEIOUY";

        while (added < size) {
            char chr = (char)((int)'A'+i);
            if (!glas.contains(""+chr)){
                chars[added]=chr;
                added++;
            }

            i++;
        }

        for (int index = 0; index < size; index++) {
            System.out.print(chars[index]);
        }

    }
}
