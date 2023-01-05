package lr6;

//Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве).
class Averager {
    static public float average(int[] ints) {
        float tmp = 0;
        for (int anInt : ints) {
            tmp += anInt;
        }
        return tmp / ints.length;
    }
}

public class Task8 {
    public static void main(String[] args) {
        System.out.println(Averager.average(new int[]{1, 2, 3, 4, 5}));
    }
}
