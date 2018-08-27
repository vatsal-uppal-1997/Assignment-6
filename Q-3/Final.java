final class Class1 {
	Class1() {
		System.out.println("No one can extend me ! :<");
	}
}

//class Class2 extends Class1 {
//  error: cannot inherit from final Class1
//}

public class Final {
	public static void main(String []args) {
		Class1 c = new Class1();
	}
}
