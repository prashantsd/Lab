package Activity;

public class AwsB {
	
private static String courseName = "AWS Cloud";
	
	
	
	private int student_id ;
	private String student_name;
	private long phone ;
	private String email;
	
	
	

	
	public AwsB() {
		super();
	}

	

	public AwsB(int student_id, String student_name, long phone, String email) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.phone = phone;
		this.email = email;
	}

	


	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public static String getCourseName() {
		return courseName;
	}

	public static void setCourseName(String courseName) {
		AwsB.courseName = courseName;
	}

	
	
	
	

}
