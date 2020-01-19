



public class LambdaAndFuctionalInterface {

	//static ArithmeticException ae;   //Runtime error.......... NullPointerException..
	
	static ArithmeticException ae=new ArithmeticException();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//throw new ArithmeticException();
		//System.out.println("hello");   //CompileTime Error ,,,,,,unreachable code.....
		
		throw ae;   //Now it works properly....... We will get arithmetic exception.....

	}

}
