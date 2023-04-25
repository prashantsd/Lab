package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeywordDemo {
	
	static void validateAge(int age) throws AgeValidationException
	{
		if(age >= 18)
		{
			System.out.println("Eligible to vote!!");
		}else 
		{
			throw new AgeValidationException("Not Eligible to vote.");
		}
	}

	public static void main(String[] args) {

		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the Age ?");
			int age = sc.nextInt();
			validateAge(age);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please give correct input !");
		}
		catch(AgeValidationException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
