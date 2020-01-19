
//method reference(::) are replacement of Lambda expression.

//Note--->number of method argument must match with the original method's arguments.


package featuresJava8;

interface DemoInterface{
	int sum(int a,int b);
}

class MyClass {
	public static void test() {
		for(int i=0;i<5;i++) {
			System.out.println("Child--> static Thread"+(i+1));
		}
	}
	
	public void instanceMethod() {
		for(int i=0;i<5;i++) {
			System.out.println("Chil--> d instance thread"+(i+1));
		}
	}
	
	public static int add(int x,int y) {
		int z= (x+y);
		return z;
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=MyClass::test;  //test() is static method.... so we can call it by Classname::methodName
		
		MyClass obj=new MyClass();
		Runnable r2=obj::instanceMethod;  //instanceMethod() is Non-Static method ,,,so object reference is required.
		
		Thread t2=new Thread(r2);
		
		Thread t1=new Thread(r1);
		t2.start();
		t1.start();
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread"+(i+1));
		}
		System.out.println("--------------------Another example-------------------------------");
		
		DemoInterface di=MyClass::add;
		
		System.out.println(di.sum(50, 50));
		
	}

}
