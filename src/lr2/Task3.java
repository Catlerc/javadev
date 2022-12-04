package lr2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args)
	{
		var in = new Scanner(System.in);
		System.out.println("Введите число, которое делится на 4 и при этом не меньше 10");
		var number = in.nextInt();
		
		var success = number%4==0 && number >= 10;
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
