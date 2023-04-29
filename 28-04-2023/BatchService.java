package Activity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BatchService {
	
	
	static JavaB course_java[] = new JavaB[10];
	static AwsB course_aws[]= new AwsB[10];
	static Scanner sc = new Scanner(System.in);
	 static int jcount = 0;
	 static int acount = 0;
	
	
	
	
	// registration course for new student
	public static void register_course_java()
	{
		
		System.out.println("Enter the Student Id");
		int sid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Student Name :");
		String sname = sc.nextLine();
		
//		System.out.println("Enter the Student Phone Number");
//		long sphone = sc.nextLong();
//		long number = (long) phone_validation(jcount);
		
		boolean loop = true;
		long sphone=0;
		
		while (loop)
		{
			System.out.println("Enter Student Phone Number : ");
			sphone = sc.nextLong(); // get phone number from user
			boolean val = Pattern.matches("[6789][0-9]{9}",""+sphone);
			if(val == true)
			{
//				course_java[jcount].setPhone(sphone); // update phone number
				loop = false;
			}
			else
			{
				System.out.println("Nmber is not valid please provide correct number again");
				loop = true;
			}
		}
		
		
		sc.nextLine();
		System.out.println("Enter the Student Email Id");
		String semail = sc.nextLine();
		
		course_java[jcount] = new JavaB(sid, sname,sphone,semail);
		jcount++;
		System.out.println("registration Successfully for Java Course !!");
		System.out.println("--------------------------------------------------------");
	}
	
	public static void register_course_aws()
	{
		System.out.println("Enter the Student Id");
		int sid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Student Name :");
		String sname = sc.nextLine();
		
		System.out.println("Enter the Student Phone Number");
		long sphone = sc.nextLong();
//		String number = phone_validation(acount);
		
		sc.nextLine();
		System.out.println("Enter the Student Email Id");
		String semail = sc.nextLine();
		
		course_aws[acount] = new AwsB(sid, sname,sphone,semail);
		acount++;
		System.out.println("registration Successfully for aws Course !!");
		System.out.println("--------------------------------------------------------");
	}
	
	// display course details
	public static void display_java_course()
	{
		System.out.println("--------------- Java Batch Student List ---------------");
		for(int i = 0 ; i < jcount ; i++) // check how many student data are store => (acount)
		{
//			System.out.println("Student "+(i+1));
			System.out.println("Student Id : "+course_java[i].getStudent_id());
			System.out.println("Student Name : "+course_java[i].getStudent_name());
			System.out.println("Student Email Id : "+course_java[i].getEmail());
			System.out.println("Student Phone Number : "+course_java[i].getPhone());
			System.out.println("Course : "+course_java[i].getCourseName()+"\n");
			
		}
		System.out.println("--------------------------------------------------------");
	}
	
	public static void display_aws_course()
	{
		System.out.println("--------------- AWS Batch Student List ---------------");
		for(int i = 0 ; i < acount ; i++) // check how many student data are store => (acount)
		{
			System.out.println("Student Id : "+course_aws[i].getStudent_id());
			System.out.println("Student Name : "+course_aws[i].getStudent_name());
			System.out.println("Student Email Id : "+course_aws[i].getEmail());
			System.out.println("Student Phone Number : "+course_aws[i].getPhone());
			System.out.println("Course : "+course_aws[i].getCourseName()+"\n");
		}
		System.out.println("--------------------------------------------------------");
	}
	
	
	
	public static void updatejava()
	{
		boolean flag = false;
		System.out.println("Enter the Student Id to update :");
		int stu_id = sc.nextInt();
			
		for(int i=0;i<jcount;i++)
		{
			if(course_java[i].getStudent_id() == stu_id)
			{
				System.out.println("Press 1) To Update Student Name \n"
						+"Press 2) To Update Student Phone Number \n"
						+ "Press 3) To Update Student email \n");
				int ch = sc.nextInt();
				
				switch(ch)
				{
				case 1:
					sc.nextLine();
					System.out.println("Enter Student Name: ");
					String sname = sc.nextLine(); // get student name from user
					
					course_java[i].setStudent_name(sname); // update student name 
					break;
				case 2:
					System.out.println("Enter Phone Number : ");
					long sphone = sc.nextLong(); // get phone number from user
					course_java[i].setPhone(sphone); // update phone number
					break;
				case 3:
					sc.nextLine();
					System.out.println("Enter email id : ");
					String semail = sc.nextLine(); // get email id from user
					course_java[i].setEmail(semail); // update email id 
					break;
				default:
					System.out.println("Invalid Input");
				}
				
				System.out.println("---------------------------------------");
				flag = true;
				break;
			
			}
		}
		
		if(flag == false) // check id is found or not
		{
			System.out.println("Student ID is not found !!");
			System.out.print("Re-");
			updatejava();
		}
		else {
			System.out.println("Student details Update Successfully !!");
		}
		
		
	}
	
	
	
	public static void updateaws()
	{
		boolean flag = false;
		System.out.println("Enter the Student Id to update :");
		int stu_id = sc.nextInt();
			
		for(int i=0;i<acount;i++)
		{
			if(course_aws[i].getStudent_id() == stu_id)
			{
				System.out.println("Press 1) To Update Student Name \n"
						+"Press 2) To Update Student Phone Number \n"
						+ "Press 3) To Update Student email \n");
				int ch = sc.nextInt();
				
				switch(ch)
				{
				case 1:
					sc.nextLine();
					System.out.println("Enter Student Name: ");
					String sname = sc.nextLine(); // get student name from user
					
					course_aws[i].setStudent_name(sname); // update student name 
					break;
				case 2:
//					phone_validation(i); //  check number is valid or not if valid then update it
					System.out.println("Enter Student Phone Number : ");
					long sphone = sc.nextLong(); // get phone number from user
					break;
				case 3:
					sc.nextLine();
					System.out.println("Enter email id : ");
					String semail = sc.nextLine(); // get email id from user
					course_aws[i].setEmail(semail); // update email id 
					break;
				default:
					System.out.println("Invalid Input");
				}
				
				System.out.println("---------------------------------------");
				flag = true;
				break;
			
			}
		}
		
		if(flag == false) // check id is found or not
		{
			System.out.println("Student ID is not found !!");
			System.out.print("Re-");
			updatejava();
		}
		else {
			System.out.println("Student details Update Successfully !!");
		}
		
		
	}
	
	
	
	public static void checkcourse(String course) // check course is available or not
	{
		if (course.equals("java") || course.equals("aws")) 
		{
			System.out.println("The course you're looking for is available with us!");
		}else
		{
			throw new CourseNotFoundException("Course is not available");
		}
	}
	
	public static long phone_validation(int index)
	{
		
		
		return 6789;
	}
	
	

}
