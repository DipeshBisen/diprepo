//Constructor reference
// test::new
//Functional interface method returns Object ...



package featuresJava8;

interface interf{
	//Test get();
	Test get(String x);
}

class Test{
	String nm;
	Test(String s) {
		// TODO Auto-generated constructor stub
		nm=s;
	}
	void data() {
		System.out.println("Test class object :"+ nm);
	}
}
public class ConstructorreferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interf f=Test::new;  //Interface get() abstract method(FI) referring to Constructor of Test class.
		
		Test obj=f.get("Dipesh");  //get method will return object of test class.
		
		obj.data();

	}

}
