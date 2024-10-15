package pac1;

class Base{
	public void basemethod()
	{
		System.out.println("Base Class method");
	}
}
class Derived extends Base
{
	public void drivedmethod()
	{
		
		System.out.println("Derived Class method");
		super.basemethod();
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Derived obj=new Derived();
		obj.basemethod();
		obj.drivedmethod();
	}

}
