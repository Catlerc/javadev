package lr4;

//Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник;
public class Task4 {

    public static void main(String[] args) {
        var size = 10;
        String[][] array = new String[size][size];
        for (int x = 0; x < size; x++)
            for (int y = 0; y < size; y++)
                if (x>=y)
                    array[x][y] = "█";
                else
                    array[x][y] = " ";

        for (int y = 0; y < size; y++) {
            var line="";
            for (int x = 0; x < size; x++){
                line+=array[y][x];
            }
            System.out.println(line);
        }
    }
}
