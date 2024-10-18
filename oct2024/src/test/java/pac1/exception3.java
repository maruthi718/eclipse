package pac1;

class EmployeeSalaryException extends Exception

{

	public EmployeeSalaryException(String message)

	{

		super(message);

	}

}
 
public class exception3 {
 
	private double Salary;

	public double getSalary()

	{

		return Salary;

	}

	public void setSalary(double Salary) throws EmployeeSalaryException

	{

		if(Salary<3000)

		{

			throw new EmployeeSalaryException("Salary below 3000 is not valid");

		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		exception3 obj=new exception3();

		try

		{

			obj.setSalary(2000);

			System.out.println(obj.getSalary());

		}

		catch(EmployeeSalaryException e)

		{

			System.out.println(e.getMessage());

		}

	}
 
}

 