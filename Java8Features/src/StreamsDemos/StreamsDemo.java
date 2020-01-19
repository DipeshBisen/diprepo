// if we want to process objects from the collections then we go for streams.
// stream().filter(....)
// stream().map(....)

package StreamsDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst=new ArrayList<Integer>();
		Predicate<Integer> p=i->i%2==0;
		
		lst.add(10);
		lst.add(5);
		lst.add(15);
		lst.add(20);
		lst.add(30);
		lst.add(55);
		
		List<Integer> flist=lst.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		List<Integer> updatedList=lst.stream().map(i->i*100).collect(Collectors.toList());
		
		Stream<Integer> fstream=lst.stream().filter(i->i%2==0);
		
		System.out.println("Updated list: "+updatedList);
		System.out.println(flist);    //[10, 20, 30]
		System.out.println(fstream);  //java.util.stream.ReferencePipeline$2@404b9385

	}

}
