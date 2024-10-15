package pac1;

interface simplecal
{
	int add(int a , int b);
	int i=10;
}

class cal implements simplecal
{
	
	public int add(int a,int b) 
	{
		return a+b;
		
	}	
	
}


public class interface_ex {
	public static void main(String[] args) 
	{
      cal obj=new cal();
      System.out.println("Addition result is :"+obj.add(10, 10));
	}
}
