package lr2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args)
	{
		var in = new Scanner(System.in);
		System.out.println("Введите число");
		var number = in.nextInt();
		
		System.out.println("Число " + number + (number%3==0?"":" не" ) +" делится на 3");
		in.close();		 
	}
}
