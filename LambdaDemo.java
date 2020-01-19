
@FunctionalInterface
interface MyInterface{
	void m1();
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface i=()->System.out.println("Hello............Lambda with Functional Interface");
		i.m1();

	}

}
