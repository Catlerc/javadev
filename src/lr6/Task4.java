package lr6;

//Напишите программу, в которой описан статический метод для вычисления
//двойного факториала числа, переданного аргументом методу. По определению, двойной
//факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.

class Factorial {
    static public long doubleFactorial(int n) {
        long tmp = 1;
        for (int i = n; i >=1; i-=2) {
            tmp *= i;
        }
        return tmp;
    }
}

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Factorial.doubleFactorial(5)); // = 15
    }
}
