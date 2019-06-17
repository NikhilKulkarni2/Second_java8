import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		
		//list.forEach(System.out::println);
		MethodReferenceExample methodReferenceExample=new MethodReferenceExample();
		
		list.forEach(methodReferenceExample::doubleIt);
		
	}
	
	public void doubleIt(int i)
	{
		System.out.println(i*2);
	}

}
