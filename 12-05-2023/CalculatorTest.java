package lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
	
	Calculator c ;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("This will execute before all test cases.");
	}
	
	@AfterAll
	static void AfterAll() {
		
		System.out.println("This will execute after all test cases. ");
	}
	
	@BeforeEach
	void beforeeach()
	{
		c = new Calculator();
	}
	
	@AfterEach
	void aftereach()
	{
		c = null;
	}
	
	
	@Test
	@DisplayName("Testing Addition Function")
	void testaddition()
	{
		assertEquals(5, c.addition(2, 3));
	}
	
	@Test
	@DisplayName("Testing Multiplication Function")
	void testmultiplication()
	{
		assertEquals(20, c.Multiplication(5, 4));
	}
	
	@Test
	@DisplayName("Testing Division Function")
	void testDivision()
	{
		assertEquals(2, c.Division(6,3));
	}
	
	@Test
	@DisplayName("Testing Subtraction Function")
	void testSubtract()
	{
		assertEquals(10, c.Subtract(15,5));
	}
	
	@Test
	@DisplayName("Testing Max Number Function")
	void testMaxNumber()
	{
		int[] arr = {5,3,7,9,4};
		assertEquals(9, c.maxNum(arr));
	}
	
	@Test
	@DisplayName("Testing Factorial Function")
	void testFactorial()
	{
		assertEquals(120, c.factorial(5));
	}
	
	
	
	
	

}
