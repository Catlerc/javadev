package lr2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args)
	{
		var in = new Scanner(System.in);
		System.out.println("Введите число, которое остаток деления которого на 5 будет равен 2, а остаток деления на 7 будет равен 1");
		var number = in.nextInt();
		
		var success = number%5==2 && number%7==1;
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
