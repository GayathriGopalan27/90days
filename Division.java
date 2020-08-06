package day1;
// find division  and reminder of any two numbers

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number to be divided");
		float  a = input.nextFloat();
		System.out.println("enter the divisor");
		float b =input.nextFloat();
		
		float c =a/b;
		float d = a%b;
	System.out.println("quotient is "+c);
	System.out.println("Reminder is "+d);
  input.close();
		
	}
}
