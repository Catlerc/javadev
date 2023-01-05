package lr6;


//Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 1^2 + 2^2 + 3^2 + ... + n^2.
// Число n передается аргументом методу.
//Для проверки результата можно использовать формулу 1^2 + 2^2 +3^2+…+n^2=n(n+1)*(2n + 1)/6

class Sum {
    static public long quadSum(long n) {
        long tmp = 0;
        for (long i = 1; i <= n; i++) {
            tmp += i * i;
        }
        return tmp;
    }
}

public class Task5 {
    public static void main(String[] args) {
        var n = 3;
        var result = Sum.quadSum(n);
        System.out.println("result: " + result);

        var check = n*(n + 1)*(2 * n + 1) / 6;
        System.out.println("real answer: " + check);


    }
}
