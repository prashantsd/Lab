package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeywordDemo2 {

	static void division(int a) throws NumDivisibleException { 
		
		
		if (a % 5 == 0 && a % 11 == 0) // check the number is divisible by 5 and 11
		{
			System.out.println(a+" is divisible by both 5 and 11");
		} 
		else 
		{
			throw new NumDivisibleException("Number is not divisible by both 5 and 11"); // throw the exception
		}

	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number ?"); // get input from user
			int num = sc.nextInt();
			division(num);
		} 
		catch (InputMismatchException e) 
		{
			System.out.println(e.getMessage());
		} 
		catch (NumDivisibleException e)  // 
		{
			System.out.println(e.getMessage());
		}

	}

}
