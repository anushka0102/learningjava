package Unit_01;

public class P5_Task1_ClassesAndObjectsInJva {
public static void main(String[] args) {
		
		ABC2 obj = new ABC2();
		obj.display2();

	}

}
class ABC2{
	int a=10;
	static int b=10;
	static void dislay() {
		int b=10;
		b++;
		//System.out.println(a);
		System.out.println(b);
	}
	void display2() {
		System.out.println(a);
		//as a was a local variable so we can't access it outside the method
		//System.out.println();
		
	}
}