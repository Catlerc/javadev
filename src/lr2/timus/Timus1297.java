package lr2.timus;

import java.io.PrintWriter;
import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1297
public class Timus1297 {
	public static String reverseString(String str){  
		StringBuilder sb=new StringBuilder(str);  
		sb.reverse();  
		return sb.toString();  
	}  
	
	public static boolean check(String st)
	{
		return reverseString(st).equals(st);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		String input = in.next();
		for(int i=input.length();i>0;i--)
		{
			int maxOffset = input.length()-i;
			for(int offset=0;offset<=maxOffset;offset++)
			{
				
				
				String sub = input.substring(offset, i+offset);
				if (check(sub))
				{
					out.println(sub);
					out.flush();
					return;
				}
				
				
			}
			
		}
	}
}
