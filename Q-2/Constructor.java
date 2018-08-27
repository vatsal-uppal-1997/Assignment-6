class Base {
	Base() {
		System.out.println("I am called by a parameterized constructor"); 	
	}
	Base(int x) {
		this();
	}
}
public class Constructor {
	public static void main(String [] args) {
		Base b1 = new Base(2);	
	}
}
