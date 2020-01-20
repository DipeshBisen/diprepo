package featuresJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Collections sort() method

//  Collections.sort(list)  
//  and
//  Collections.sort( list, Comparator )

class Students implements Comparable<Students>{
	private Integer id;
	
	String name;
	public Students(int id,String nm) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.name=nm;
	}
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());  //calling compareTo() method
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[id: "+this.id+" Name : "+ this.name +"]";
	}
}

public class ComparatorAndComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Students> lst=new ArrayList<Students>();
		lst.add(new Students(5, "Ram"));
		lst.add(new Students(10, "Shyam"));
		lst.add(new Students(6, "Arsuh"));
		lst.add(new Students(2, "Monu"));
		
		//Collections.sort(lst);   //here by deafult CompareTo() method gets called
		
		//Comparator< Students> c=(i1,i2)->(i1.getId()>i2.getId())?-1:(i1.getId()<i2.getId())?1:0;  //here Comaparator Interface is used having comapare(i1,i2) method.
		Comparator<Students> c=(i1,i2)->-i1.compareTo(i2);  // -ve will reverse the natural sorting.
		
		Collections.sort(lst, c);
		
		System.out.println(lst);

	}

}
