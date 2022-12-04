package lr2;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args)
	{
		var in = new Scanner(System.in);
		System.out.println("Введите число");
		var number = in.nextInt();


		System.out.println("В нём "+((number/1000)%10)+" тысяч! (4 цифра)");
		
		in.close();		 
	}
}
