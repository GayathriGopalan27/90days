package day1;

import java.util.Scanner;

public class PerfectSquare {
	
	public static void main(String[] args) {
		int count=0;	
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number to check whether its a perfect square");
		int  a =  input.nextInt();
		int num =2;
		while (num<= (a/2)+1)
		{
			int c= num*num;
			if (a==c)
			{		
				count =1;
				
				break;
			}
									
			num++;
		}
		if (count ==1)
		{
			System.out.println( a +"number is perfect square");
		}
		else {
			System.out.println( a +"number is not a perfect square");

		}
	
	}

}
