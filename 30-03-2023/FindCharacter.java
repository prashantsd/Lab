package basic;
import java.util.Scanner;

public class FindCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Character");
		char a = sc.next().charAt(0);
		
		
		if(a>='0' && a<='9') 
		{
			System.out.println("It is a Digit :");
		}
		else if((a>='a' && a<='z') || (a>='A' && a<='Z')) 
		{
			System.out.println("It is a Alphabet :");
		}
		else 
		{
			System.out.println("It is a Special Symbol :");
		}
	}

}
