package Activity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BatchApplication {
	
	


	public static void main(String[] args) throws CourseNotFoundException {

		Scanner sc = new Scanner(System.in);
		
		BatchService b = new BatchService();
		
		while(true)
		{
			System.out.println("Press 1) Java 2) Aws 3) Others 4) Exit");
			int i = sc.nextInt();
			if(i==1) // Java Batch details
			{
				System.out.println("1) Register new student ?");
				System.out.println("2) Show all student details.");
				System.out.println("3) Update student details using id");
				
				int op = sc.nextInt();
				
				switch(op)
				{
				case 1:
					b.register_course_java();
					break;
				case 2:
					b.display_java_course();
					break;
				case 3:
					b.updatejava();
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
				
			}
			else if(i==2) // AWS Batch details
			{
				System.out.println("1) Register new student ?");
				System.out.println("2) Show all student details.");
				System.out.println("3) Update student details using id");
				
				int op = sc.nextInt();
				
				switch(op)
				{
				case 1:
					b.register_course_aws();
					break;
				case 2:
					b.display_aws_course();
					break;
				case 3:
					b.updateaws();
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
			}
			else if(i==3) // Search Course
			{
				try 
				{
					sc.nextLine();
					System.out.println("Enter the course name you want to search:");
					String course = sc.nextLine().toLowerCase();
					b.checkcourse(course);
					
				}catch(CourseNotFoundException e)
				{
					System.out.println(e.getMessage());
				}
				
			}
			else if(i==4) // exit program
			{
				System.out.println("Exit...");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Input, please provide correct input");
			}
		}
	}

}
