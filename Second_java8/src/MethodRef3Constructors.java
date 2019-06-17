interface messageInterface{
	void say(String msg);
}
class Msgc{
	Msgc(String msg){
		System.out.println("message is =>"+msg);
	}
}
public class MethodRef3Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     messageInterface hello=Msgc::new;
     hello.say("Hello");
	}
	
	}
	

