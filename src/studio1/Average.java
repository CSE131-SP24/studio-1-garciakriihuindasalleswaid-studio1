package studio1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first integer");
		int x1 = in.nextInt();
		System.out.println("Input the second integer");
		int x2 = in.nextInt();
		double avg = (x1 + x2)/2.0; 
		System.out.println("The verage of these two integers is: " + avg);
		

	}

}
