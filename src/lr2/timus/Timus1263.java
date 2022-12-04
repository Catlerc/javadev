package lr2.timus;

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

// https://acm.timus.ru/problem.aspx?space=1&num=1263
public class Timus1263 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int candidates = in.nextInt();
		int voters = in.nextInt();
		
		int[] votes = new int[candidates];
		
		for (int i=0; i<voters;i++) {
			int candidate = in.nextInt();
			votes[candidate-1]++;
		}
		
		int sum =0;
		
		for (int i=0; i<candidates;i++) {
			sum+=votes[i];
		}
		
		
		for (int i=0; i<candidates;i++) {
			out.println((String.format("%.2f", (float)votes[i]/sum*100)+"%").replace(",", "."));
		}
		out.flush();
	}
}

