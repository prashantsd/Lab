package String;

public class String_Lab {

	public static void main(String[] args) {


		String str = "Welcome to Java World ";
		
//		Returns the character at 5th position and display it.
		
		char ch = str.charAt(4);
		System.out.println("The character at 5th position is : "+ch);
		
//		Compares the above String with “Welcome” lexicographically ignoring case differences 
//		and display the result
		
			
		int compare = str.compareToIgnoreCase("Welcome");
		System.out.println("Lexicographically compare strings is   : " + compare);
		
		
//		Concatenates “- Let us learn” to the above string and display it.
		
		String con = "Concate : " + str.concat("Let us learn");
		System.out.println(con);
		
//		return position of first occurence of character 'a'
		
		int i = str.indexOf('a');
		 System.out.println("Position of first occurence of character 'a' is : " + i);

//		 Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
		 
		 String str3 = str.replaceAll("a", "e");
		 System.out.println("Replace String :" + str3 );
		 
//		 Returns string between 4th position and 10th position and display it.
		 String str4 = str.substring(3, 11);
		 System.out.println("String between 4th and 10th position is : "+str4);
		 
		 
//		 Returns the lowercase of the string and display it.
		 
		 String s = "PRASHANT";
		 String l = s.toLowerCase();
		 System.out.println("Original String :"+s+"\nNew String : "+l);
		 
		 
	}

}
