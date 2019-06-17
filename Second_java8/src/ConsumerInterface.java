import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	//It is functional interface having one abstract method void accept(T t)
	//forEach(accept(T t))
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<Integer> values=Arrays.asList(23,54,7,85,6,88);
	
		//Using Consumer Interface internal implementation
		Consumer<Integer> c=new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		values.forEach(c); // using consumer
		
		//	values.forEach(System.out::println); // Using simple sysout with method reference::
	 
		System.out.println();
	    System.out.println();
		System.out.println(" Using parameter ");
		values.forEach(a->System.out.println(a)); // using parameter
	}

}
