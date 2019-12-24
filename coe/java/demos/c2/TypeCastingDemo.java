package coe.java.demos.c2;

public class TypeCastingDemo {
	public static void main(String[] args){
		int a = 17;
		double x;
		short b;
		// double on LHS 
		// int on RHS
		x = a; 
		// a is in type int (32 bits)
		// b is in type short (16 bits)
		// a = b;
		//b = a;
		// type casting
		// change the type of a from int to short
		b = (short) a;
		int c = Integer.parseInt("10");
		System.out.println("x = " + x + " b = " + b + " c = " + c);
		int d = Integer.parseInt("ab");
		System.out.println(d);
	}
}
