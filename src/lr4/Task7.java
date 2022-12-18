package lr4;

//Напишите программу, в которой создается двумерный числовой массив
//и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//далее.
public class Task7 {

    static int[][] sides = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void draw2DArray(int[][] array) {
        for (int y = 0; y < array.length; y++) {
            var line = "";
            for (int x = 0; x < array[y].length; x++) {
                line += array[y][x] + " ";
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        var size = 10;
        int[][] array = new int[size][size];

        var n = 0;
        var x = 0;
        var y = 0;
        var failCount = 0;
        var side = 0;// напрамление "змейки"
        while (true) {
            n++;
            array[x][y] = n;

            var nx = x + sides[side][0];
            var ny = y + sides[side][1];

            if (nx < size && nx >= 0 && ny < size && ny >= 0 && array[nx][ny] == 0) {
                failCount = 0;
                x = nx;
                y = ny;
            } else {
                side++;
                if (side > 3) side = 0;
                failCount++;
            }

            if (failCount >= 3) break;

            System.out.println("\nИтерация " + n + "\n");
            draw2DArray(array);
        }
    }
}
