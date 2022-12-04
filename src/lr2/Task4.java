package lr2;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args)
	{
		var in = new Scanner(System.in);
		System.out.println("Введите число в диапазоне от 5 до 10 включительно");
		var number = in.nextInt();
		
		var success = number>=5 && number <=10;
		if (success) {
			System.out.println("Число "+number+" подходит");
		}
		else
		{
			System.out.println("Число "+number+" не подходит");
		}
		
		in.close();		 
	}
}
