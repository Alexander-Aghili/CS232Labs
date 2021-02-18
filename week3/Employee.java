
public class Employee {
	
	private String name;
	private String phoneNumber;
	private int age;
	
	public Employee(String name, String phoneNumber, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		try {
			this.age = validAge(age);
		} catch (NegativeAgeException e) {
			System.out.println("The age of the employee is negative.");
		}
	}
	
	private int validAge(int age) throws NegativeAgeException{
		if (age < 0) {
			throw new NegativeAgeException();
		}
		return age;
	}

}
