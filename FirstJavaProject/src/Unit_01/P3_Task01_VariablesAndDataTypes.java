 package Unit_01;
/*
 * - Variable in java is a data container that saves the values during Java program execution
 *  
 *  Types of Variables:
 *   In Java, there are three types of variables:
 *   
 *     Local Variables- declared inside the body of a method
 *     
 *     Instance Variables- Instance variables are defined without the STATIC keyword.
 *     - They are defined Outside a method declaration.
 *     - They are Object specific are and are known as Instance variables.
 *     
 *      Static Variables-
 *      - static variables are defined with the STATIC keyword
 *      - Static variables are initialized only once, at the start of the program execution.
 *      - These static variables should be initialized first, before, the initialization of any method
 *      
 *   - Data Types in Java?
 *   . Reference OneNote
 *     -Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
 *     -Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
 *     
 *     Why char uses 2 byte in java and what is \u0000 ?
 *     It is because java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system.
 *     Unicode is a universal international standard character encoding that is capable of representing most of the 
 *     world's written languages.
 */

public class P3_Task01_VariablesAndDataTypes {
	
	static int q = 11;
	int p = 10;

	public static void main(String[] args) {
		
		// Valid Declarations
		int a, b, c;
		float pi;
		double d;
		char e;
		
		// Valid Initializations
		pi = 3.14f;
		d = 20.22d;
		e = 'v';
		
		a = 10;
		b = 10;
		c = 10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum = 5; // Integer (whole number)
		float myFloatNum = 5.99f; // Floating point number
		char myLetter = 'D'; // Character
		boolean myBool = true; // Boolean
		String myText = "Hello"; // String
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		/*
		 * Java Variable Type Conversion & Type Casting: Details are in OneNote
		 * 
		 * The process of converting a value from one data type to another is known as type conversion in Java.
		 * Automatic conversion (casting) done by Java compiler internally is called implicit conversion or implicit type casting in 
		 * java.
		 * Implicit casting is performed to convert a lower data type into a higher data type.
		 * 
		 * The conversion of an int value to byte is an incompatible type and it cannot be performed automatically by Java compiler 
		 * because byte is smaller than int.
		 * Similarly, no automatic conversion will take place from double to byte. 
		 * These kinds of conversions can be done by using a technique called explicit casting.
		 * 
		 * we cannot convert a primitive data type into an advanced (referenced) data type by using type casting. 
		 * For this case, we will have to use methods of Java Wrapper classes.
		 */
		
		double f;
		int i = 10;
		f = i; // Type Conversion
		
		double g = 10;
		int j;
		j = (int) g; // Type Casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		byte k = 10; // 1 byte
		boolean l = true; // 1 bit = true or false only
		long m = 10L;
		float n = 1.2f;
		double o = 1.2d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(STU.j); //data + function/methods
		// ABC.display();
		
		STU obj1 = new STU();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		STU obj2 = new STU();
		System.out.println(obj2.i);
		
		//System.out.println(obj1.j++);
		//System.out.println(obj1.j);
		//System.out.println(obj2.j);
		
		System.out.println(STU.j++);
		System.out.println(STU.j);
		
		STU.typeconversionAndtypeCasting();
		
	}
	
	int r = 10;
	
	void display() {
		
		int a = 5; // local Variable
		System.out.println("This is Display Method");
		System.out.println(a);
		
	}

}

class STU {
	
	static int j = 10; // class variable/static variable
	int i = 10; // Instance Variable
	
	static void display() {
		
		int a = 5; // local Variable
		System.out.println("This is Display Method");
		System.out.println(a);
		
	}
	
	static void typeconversionAndtypeCasting() {
		
		/*
		 * double f; //8 bytes = 64 bits/slots int i = 10; // 4 bytes = 32 bits/slots f
		 * = i; //Type Conversion System.out.println(f);
		 * 
		 *  double g = 10; //64 int j; //32 j = (int)g;
		 */
		
		double f; //64 slots
		int i = 10; //32 slots
		f = i; //Type Conversion
		System.out.println(f);
		
		double g = 10; //64
		int j; //32
		j = (int)g; // Type Casting
		
		//32 bits = 64 bits
		
		System.out.println(i);
		System.out.println(j);
	}
}