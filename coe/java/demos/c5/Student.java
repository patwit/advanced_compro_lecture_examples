package coe.java.demos.c5;

class Student {
	public String name; // Student’s name.
	public double test1, test2, test3;   // Grades on three tests.
	public double getAverage() { // compute average test grade
	   return (test1 + test2 + test3) / 3;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student std, std1,    // Declare four variables of
        std2, std3; //   type Student.
		std = new Student();  // Create a new object belonging
		std1 = new Student(); // Create a second Student object
		std3 = null;          // Store a null reference in the
                    //   variable std3.
		std1.name = "David";
		std2 = std1;
		std2.name = "John";
		System.out.println("std1.name = " + 
				std1.name);
		System.out.println("std2.name = " + 
				std2.name);
		if (std1 == std2) {
			System.out.println("std1 is equal to std2");
		} else {
			System.out.println("std1 is not equal to std2");
		}
	}

}
