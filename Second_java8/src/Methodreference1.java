interface Sayble{
	void say();
}
public class Methodreference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayble sayble=Methodreference1::saySomething; // To call static method 
		sayble.say();
	
	}

	
	public static void saySomething() {
		
		System.out.println("SaySomething method call by say()");
	}
}
