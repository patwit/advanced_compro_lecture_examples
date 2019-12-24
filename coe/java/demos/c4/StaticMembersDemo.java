package coe.java.demos.c4;

public class StaticMembersDemo {
	static final String COURSE_ID = "188230"; // static member
	static String courseLocation;
	String grade = "A";
		
	// non-static method
	String getGrade() {
		return grade;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0; //local variable
		// String grade = "A";
		// assigment statement
		courseLocation = "4309";

		// create object
		StaticMembersDemo smd = new StaticMembersDemo();
		StaticMembersDemo smd2 = new StaticMembersDemo();

		System.out.println("This course is " + COURSE_ID);
		System.out.println("It takes place at " + courseLocation);
		System.out.println("Grade is" + smd.getGrade());
	}
}
