package lr5;


//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.

class IntHolder {
    private int a;
    private int b;

    public IntHolder() {
    }

    public IntHolder(int a) {
        this.a = a;
    }

    public IntHolder(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class Task3 {
    public static void main(String[] args) {
        new IntHolder();
        new IntHolder(1);
        new IntHolder(1,2);
    }
}
