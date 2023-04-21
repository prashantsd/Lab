package String;
/*
Create an abstract class called "Shape" with an abstract method called "calculateArea". 
Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and implement the 
"calculateArea" method. Create objects of both the Circle and Rectangle classes and call their 
respective "calculateArea" methods.

Create an abstract class called "BankAccount" with attributes such as account number and balance, 
and abstract methods called "deposit" and "withdraw". Create a subclass called "CheckingAccount" 
that inherits from BankAccount and implements the "deposit" and "withdraw" methods. 
Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.

*/
abstract class Shape
{
	abstract void calculateArea();
	
}

class Circle extends Shape{
	
	double r;
	

	public Circle(double r) {
		super();
		this.r = r;
	}



	@Override
	void calculateArea() {
		double area = 3.14 *r*r;
		System.out.println("Area of circle : "+area);

		
	}
	
}

class Rectangle extends Shape{
	
	double l ,b;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	
	@Override
	void calculateArea() {
		double area = l*b;
		System.out.println("Area of rectangle :"+area);
	}
	
}

public class Abstract_Lab {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		c.calculateArea();
		Rectangle r = new Rectangle(5,8);
		r.calculateArea();
		
	}

}
