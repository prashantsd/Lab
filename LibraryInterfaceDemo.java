package lab;

interface LibraryUser
{
	void registerAccount();
	void requestBook();
}

class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	
	
	
	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}
	@Override
	public void registerAccount() {
		if(age < 12) {
			System.out.println("You have Successfully Registered under a Kids Account ");
		}
		
		if(age > 12) {
			System.out.println("Sorry, Age must be less then 12 to register as a kid ");
		}
		
	}
	@Override
	public void requestBook() {
		if(bookType.equalsIgnoreCase("kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}


class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	
	

	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if(age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		
		if(age < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType.equalsIgnoreCase("fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {

//		Test case 1
		KidUsers k =  new KidUsers(10,"fiction"); // set the value
		System.out.println("Kids Age : "+k.age);
		System.out.println("Book type : "+k.bookType);
		k.registerAccount();
		k.requestBook();
		
		
		
		System.out.println();
		
		KidUsers k2 =  new KidUsers(18,"fiction"); // set the value
		System.out.println("Kids Age : "+k2.age);
		System.out.println("Book type : "+k2.bookType);
		k2.registerAccount();
		k2.requestBook();
		
		System.out.println("-------------------------------------------------------------------");
		
//		Test case 2
		AdultUser a = new AdultUser(5,"kids"); // set the value
		System.out.println("User Age : "+a.age);
		System.out.println("User Age : "+a.bookType);
		a.registerAccount();
		a.requestBook();
		
		System.out.println();
		
		AdultUser a2 = new AdultUser(23,"fiction"); // set the value
		System.out.println("User Age : "+a2.age);
		System.out.println("User Age : "+a2.bookType);
		a2.registerAccount();
		a2.requestBook();

		
		
		
	}

}
