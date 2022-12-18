package lr4;

//Напишите программу, в которой создается двумерный массив, который
//выводи(т?) прямоугольник из цифр 2;
public class Task3 {
    public static void main(String[] args) {
        var size = 10;
        int[][] array = new int[size][size];
        for (int x = 0; x < size; x++)
            for (int y = 0; y < size; y++) array[x][y] = 2;

        for (int y = 0; y < size; y++) {
            var line="";
            for (int x = 0; x < size; x++){
                line+=array[y][x];
            }
            System.out.println(line);
        }
    }
}
