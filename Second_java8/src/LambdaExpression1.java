@FunctionalInterface
interface demoFunctionalInterface{
	//public void message(String msg);
     public int add(int a,int b);
}
public class LambdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String msg="I am functional interface";
		
		//demoFunctionalInterface demo =(msg)->System.out.println(""+msg);
		//demo.message("i am func interface");
	
		//Must need to use return keyword when there are more than one statement inside { }
	    demoFunctionalInterface d2=(a,b)->{int i; return a+b;};  // use when method return type is int 
	    System.out.println("Addition is :-  " +d2.add(20, 30));
		
		//demoFunctionalInterface d=(a,b)->System.out.println("add is=>"+(a+b));  //Use when method return type is void
	    //	d.add(10, 20);  
	}

	

}
