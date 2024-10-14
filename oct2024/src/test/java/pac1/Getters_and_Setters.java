package pac1;

public class Getters_and_Setters {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Getters_and_Setters obj = new Getters_and_Setters();
		obj.setName("Saritha");
		System.out.println("Name is:"+obj.getName());
		obj.setAge(35);
		System.out.println("Name is:"+obj.getAge());
		

	}

}