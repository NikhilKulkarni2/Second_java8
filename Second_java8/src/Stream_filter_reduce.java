import java.util.Arrays;
import java.util.List;

public class Stream_filter_reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list= Arrays.asList(12,25,32,45,52,65);
		
		int result =0;
		
		for(int i:list)
		{
			if(i%5==0)
			{
				result+=i;
			}
		}
		
		System.out.println("Result using enhance for loop without using Stream  => "+ result);
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Result using Stream  => "+ list.stream().filter(i->i%5==0).reduce(0, (c,e)->c+e));
		System.out.println();
		System.out.println();
		System.out.println("Result Till filter => ");
		list.stream().filter(i->i%5==0).forEach(System.out::println);
	}

}
