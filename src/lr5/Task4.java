package lr5;


//Напишите программу с классом, у которого есть символьное и
//целочисленное поле. В классе должны быть описаны версии конструктора с
//двумя аргументами (целое число и символ – определяют значения полей), а
//также с одним аргументом типа double. В последнем случае действительная
//часть аргумента определяет код символа (значение символьного поля), а
//дробная часть (с учетом десятых и сотых) определяет значение
//целочисленного поля. Например, если аргументом передается число 65.1267,
//то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
//поле получит значение 12 (в дробной части учитываются только десятые и
//сотые).

class SomeClass {
    public char chr;
    public int integer;

    public SomeClass(char chr, int integer) {
        this.chr = chr;
        this.integer = integer;
    }

    public SomeClass(double dbl) {

        chr = (char) dbl;
        integer = (int) ((dbl % 1)*100);
    }
}

public class Task4 {
    public static void main(String[] args) {
        var test = new SomeClass(33.1234d);
        System.out.println(test.chr);
        System.out.println(test.integer);
    }
}
