package lab;



public class Calculator {

	
	// Addition Function
	public int addition(int a,int b)
	{
		int c=0;
		c = a+b;
		System.out.println("Addition : "+c);
		return c;
	}
	
	// Multiplication Function
	public int Multiplication(int a,int b)
	{
		int c=0;
		c = a*b;
		System.out.println("Multiplication : "+c);
		return c;
	}
	
	// Subtract Function
	public int Subtract(int a,int b)
	{
		int c=0;
		c = a-b;
		System.out.println("Subtract : "+c);
		return c;
	}
	
	// Division Function
	public int Division(int a,int b)
	{
		int c=0;
		c = a/b;
		System.out.println("Division : "+c);
		return c;
	}
	
	// Find max Number from array Function
	public int maxNum(int[] arr)
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Max Number : "+max);
		return max;
	}
	
	// factorial Function
	public int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{    
		      fact = fact * i;    
		} 
		System.out.println("Factorial of "+num+" is "+fact);
		return fact;
	}
	
	
	
}
