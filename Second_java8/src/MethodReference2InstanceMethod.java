import java.lang.management.MemoryType;

interface sayble1{
	void say();
}
public class MethodReference2InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReference2InstanceMethod method=new MethodReference2InstanceMethod();
       sayble1 sayble1=method::saySomething;
       sayble1.say();
	}

public void saySomething() {
		
		System.out.println("SaySomething method call by say()");
	}
}
