package lr4;


//Напишите программу, которая выводить в консольное окно
//прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
//строк;
public class Task1 {
    public static void main(String[] args) {
        var w = 23;
        var h = 11;
        for (int i = 0; i < h; i++) {
            System.out.println("█".repeat(w));
        }
    }
}
