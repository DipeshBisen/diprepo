package featuresJava8;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Predicate ,Function and Consumer are predefined functional interfaces

//Predicate--> boolean test(T t) -----> returns boolean
//Function --> R apply(T t) ----------> returns R  ...(what we want to return),,,int,float,, etc
//Consumer --> void accept(T t) ---------> returns nothing(void)

class MyDemo implements Predicate<Student>,Function<Student, String>,Consumer<Student>{

	//Consumer method
	@Override
	public void accept(Student t) {
		// TODO Auto-generated method stub
		
	}

	//Function method
	@Override
	public String apply(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	//Predicate method
	@Override
	public boolean test(Student t) {
		// TODO Auto-generated method stub
		return false;
	}
	
}


//--------------------------------------------------------------
class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
}

public class DemoPredefinedFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stds[]= {
				new Student("Ram", 45),
				new Student("Shyaam", 65),
				new Student("Raj", 75),
				new Student("Ram", 80),
				new Student("Pret", 85),
				new Student("Aloo", 33)
		};
		
		//Predicate ......implementation check() method of
		Predicate<Student> predicate=s->s.marks>=75;
		
		//Function .......implementation apply() method of
		Function<Student, String> function=s->{
			int mrks=s.marks;
			if (mrks>=80) return "Grade A[First Class]";
			if (mrks>=70) return "Grade B[Second Class]";
			if (mrks>=50) return "Grade C[Third Class]";
			else
				return "Fail";
		};
		
		//Function .......implementation apply() method of
		Consumer<Student> consumer=s->{
			System.out.println("Student Name:"+s.name);
			System.out.println("Student marks:"+s.marks);
			System.out.println("Student Grade:"+function.apply(s));
			System.out.println("----------------------------------------");
		};
		
		for(Student student: stds) {
			if(predicate.test(student)) {
				consumer.accept(student);
			}
				
		}
		
		
	}

}
