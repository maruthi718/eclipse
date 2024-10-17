package pac1;

public class exception2 {

	public static void main(String[] args) {
 
		try {
			String str=null;
			str.equals("Hello");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+"SKEXCEPTION");
		}
		System.out.println("Welcome");
		
	}

}