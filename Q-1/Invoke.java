class Parent {
	public void hello() {
		System.out.println("Hello, I am in the Parent class !");
	}
}
class Child extends Parent {
	public Child() {
		super.hello();
	}
}
public class Invoke {
	public static void main(String [] args) {
		Child c1 = new Child();
	}
}
