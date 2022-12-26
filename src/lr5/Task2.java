package lr5;

//Напишите программу с классом, у которого есть два символьных поля и
//метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//выводит в консольное окно все символы из кодовой таблицы, которые
//находятся «между» символами, являющимися значениями полей объекта (из
//которого вызывается метод). Например, если полям объекта присвоены
//значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//выводиться все символы от ‘A’ до ‘D’ включительно.

class CharRange {
    private char start;
    private char end;

    public CharRange(char start, char end) {
        this.start = start;
        this.end = end;
    }

    public void print() {
        var res = "";
        for (int i = start; i <= end; i++) {
            res += (char) i;
        }
        System.out.println(res);
    }
}

public class Task2 {
    public static void main(String[] args) {
        var range = new CharRange('a', 'e');
        range.print();
    }
}
