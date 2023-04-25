package Exception;

import java.util.Scanner;

public class TaxCalculator {
	
	static double calculateTax(String empname,boolean isIndian,double empsal) throws CountrynotValidException,EmployeeNameInvalidException,TaxNotEligibleException
	{
		double taxAmount;
		
		if(isIndian == false) // if employee is not Indian citizen
		{
			throw new CountrynotValidException("The employee should be an Indian citizen for calculating tax”");
		}
		if(empname.isEmpty()) // if employee name is empty or null
		{
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		
		if ((empsal >= 100000) && isIndian == true)
		{
			taxAmount = empsal * 8 / 100;
		}
		else if((empsal >= 50000 && empsal <= 100000) && isIndian == true)
		{
			taxAmount = empsal * 6 / 100;
		}
		else if((empsal <= 50000 && empsal >= 30000) && isIndian == true)
		{
			taxAmount = empsal * 5 / 100;
		}
		else if((empsal <= 30000 && empsal >= 10000) && isIndian == true)
		{
			taxAmount = empsal * 4 / 100;
		}
		else
		{
			throw new TaxNotEligibleException("The employee does not need to pay tax"); 
		}
			
		
		return taxAmount; // return Tax Amount
	}
	

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in))
		{
						
			
//			System.out.println("Enter the Employee Name");
//			String empname = sc.nextLine();
//			
//			System.out.println("Enter the Employee Citizen\n press 1 for Indian\npress 2 for NRI");
//			int i = sc.nextInt();
//			
//			boolean b = i == 1 ? true : false;
//			
//			System.out.println("Enter the Employee Salary");
//			double empsal = sc.nextDouble();
//			
//			calculateTax(empname, b, empsal);

			
			
			
//			Test case 1
			System.out.println("Tax Amount is : "+calculateTax("Ron",false,34000));
			
//			Test case 2
//			System.out.println("Tax Amount is :"+calculateTax("Tim",true,1000));
//			
//			Test case 3
//			System.out.println("Tax Amount is : "+calculateTax("Jack",true,55000));
//			
//			Test case 4
//			System.out.println("Tax Amount is : "+calculateTax("",true,30000));
			
			
			
			
		}
		catch(CountrynotValidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Thank you for visiting....");
		
	}

}
