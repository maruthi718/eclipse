package pac1;


abstract class Shape
{
	abstract void draw();
	
	abstract void paint();
}

class rect extends Shape
{

	
	void draw()
	{
		System.out.println("Rectangle");
	}

	
	void paint() {
		
		System.out.println("Paint");
	}
}




public class Abstractclass {

	public static void main(String[] args) {
		
       Shape obj=new rect();
       obj.draw();
       obj.paint();
	}

}