package CollectionsDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyClass implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=5;i++) {
			System.out.println("Thread "+ Thread.currentThread().getName()+ "  Count: "+i);
			Thread.sleep(400);
			sum=sum+i;
		}
		return sum;
	}
	
	
}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		MyClass[] jobs= {
				new MyClass(),
				new MyClass(),
				new MyClass()
		};
		
		ExecutorService pool=Executors.newFixedThreadPool(1);
		
		Set<Future<Integer>> results=new HashSet<Future<Integer>>();
		
		Future< Integer> f = null;
		for(MyClass obj:jobs) {
			
			f=pool.submit(obj);
			
			results.add(f);
			
		}
		
		for (Future<Integer> fobj: results) {
			
			if(!fobj.isDone())
				System.out.println("Result is not done!!!!");
		}
		
		
		for (Future<Integer> fobj: results) {
			
			System.out.println(fobj.get());
			
		}
		
			
	}

}
