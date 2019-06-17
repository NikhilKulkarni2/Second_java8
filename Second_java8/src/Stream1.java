import java.util.Arrays;
import java.util.List;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"nikhil","swapnil","sachin","sanket","Aniket","manoj","sambasiva"};
		
		Arrays.stream(names)
		.filter(x->x.startsWith("s"))
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		System.out.println();System.out.println();
		
		
		List<String> people=Arrays.asList("nikhil","swapnil","sachin","sanket","Aniket","manoj","sambasiva","anuja");
		
		people.stream()
		      .map(String::toLowerCase)
		    //  .filter(x->x.startsWith("a"))
		      .forEach(System.out::println);
	}

}
