package basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int count=0;
		while(count<=0) {
		
			
			System.out.println("Enter Which Operation Your Perform ?");
			System.out.println("1) Addition");
			System.out.println("2) Multiplication");
			System.out.println("3) Division");
			System.out.println("4) Exit");
			
			
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				addition();
				break;
			case 2:
				multiplication();
				break;
			case 3:
				division();
				break;
			case 4:
				count = 1;
				break;
			default:
				System.out.println("Invalid Choice");
			}	
		}
		
		System.out.println("Successfully Exit...");
		
	}

	private static void division() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		float a = sc.nextFloat();
		System.out.println("Enter the 2nd number");
		float b = sc.nextFloat();

		float result = a / b;
		System.out.println("Division :  " + a + " / " + b + " = " + result);
	}

	private static void addition() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		float a = sc.nextFloat();
		System.out.println("Enter the 2nd number");
		float b = sc.nextFloat();

		float result = a + b;
		System.out.println("Addition :  " + a + " + " + b + " = " + result);
	}
	
	private static void multiplication() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		float a = sc.nextFloat();
		System.out.println("Enter the 2nd number");
		float b = sc.nextFloat();

		float result = a * b;
		System.out.println("Multiplication :  " + a + " * " + b + " = " + result);
	}

}
