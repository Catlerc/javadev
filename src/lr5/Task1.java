package lr5;


//Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.

class CharHolder {
    private char chr;

    public CharHolder(char chr) {
        this.chr = chr;
    }

    public void setChar(char chr) {
        this.chr = chr;
    }

    public char getChar() {
        return chr;
    }
    public void printChar() {
        System.out.println(chr+" " + (int) chr);
    }
}

public class Task1 {
    public static void main(String[] args) {
        var holder = new CharHolder('a');
        holder.setChar('b');

        holder.printChar();
    }
}
