package lr5;

import java.util.Random;

//Напишите программу с классом, у которого есть закрытое целочисленное
//поле. Значение полю присваивается с помощью открытого метода. Методу
//аргументом может передаваться целое число, а также метод может вызываться
//без аргументов. Если методы вызывается без аргументов, то поле получает
//нулевое значение. Если метод вызывается с целочисленным аргументом, то
//это значение присваивается полю. Однако если переданное аргументом
//методу значение превышает 100, то значением полю присваивается число 100.
//Предусмотрите в классе конструктор, который работает по тому же принципу
//что и метод для присваивания значения полю. Также в классе должен быть
//метод, позволяющий проверить значение поля.

class IntegerHolder {
    private int integer;

    public void setInteger(){
        integer = 0;
    }
    public void setInteger(int newInteger){
        integer = Math.min(newInteger, 100);
    }

    public IntegerHolder(int integer) {
        setInteger(integer);
    }

    public int getInteger() {
        return integer;
    }
}

public class Task5 {
    public static void main(String[] args) {
        var holder = new IntegerHolder(420);
        System.out.println(holder.getInteger());
        holder.setInteger();
        System.out.println(holder.getInteger());
        holder.setInteger(123);
        System.out.println(holder.getInteger());

    }
}
