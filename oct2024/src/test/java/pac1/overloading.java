package pac1;

public class overloading {

	overloading()
	{
		System.out.println("Constructor without parameter");
	}
	
	overloading(int value)
	{
		System.out.println("Constructor with parameter"+ value);
	}
	
	
	public static void main(String[] args) {
		overloading a=new overloading();
		overloading b=new overloading(2500);
		
	}

}
