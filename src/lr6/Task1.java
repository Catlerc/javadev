package lr6;

//Напишите программу с классом, в котором есть два поля: символьное и текстовое.
//В классе должен быть перегруженный метод для присваивания значений полям. Если метод
//вызывается с символьным аргументом, то соответствующее значение присваивается
//символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//значение текстового ноля. Методу аргументом также может передаваться символьный
//массив. Если массив состоит из одного элемента, то он определяет значение символьного
//поля. В противном случае (если в массиве больше одного элемента) из символов массива
//формируется текстовая строка и присваивается значением текстовому полю.


class TextHolder {
    public char chr;
    public String str;

    public void set(char chr) {
        this.chr = chr;
    }

    public void set(String str) {
        this.str = str;
    }

    public void set(char[] chars) {
        if (chars.length == 1) chr = chars[0];
        else
            str = new String(chars);
    }
}

public class Task1 {
    public static void main(String[] args) {
        var holder = new TextHolder();
        holder.set('a');
        System.out.println(holder.chr);

        holder.set("Str");
        System.out.println(holder.str);

        holder.set(new char[]{'w'});
        System.out.println(holder.chr);

        holder.set(new char[]{'t', 'e', 'x', 't'});
        System.out.println(holder.str);
    }
}
