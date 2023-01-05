package lr6;

//Напишите программу с классом, в котором есть закрытое статическое
//целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//статический метод, при вызове которого отображается текущее значение статического
//поля, после чего значение поля увеличивается на единицу.

class Counter {
    static private int value;

    static public void printAndInc(){
        System.out.println(value);
        value++;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Counter.printAndInc();
        Counter.printAndInc();
        Counter.printAndInc();
        Counter.printAndInc();
    }
}
