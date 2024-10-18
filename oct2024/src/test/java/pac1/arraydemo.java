package pac1;

public class arraydemo {

	int intnumbers[];

	Tc_ArrayDemo(int i)

	{

		intnumbers=new int[i];

	}

	void populatearray()

	{

		for(int i=0;i<intnumbers.length;i++)

		{

			intnumbers[i]=i*5;

		}

	}

	void displaycontents()

	{

		for(int i=0;i<intnumbers.length;i++)

		{

			System.out.println("Number"+intnumbers[i]);

		}

	}
 
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		arraydemo obj=new arraydemo(5);

		obj.populatearray();

		obj.displaycontents();
 
	}
 
}

 