public class Employee {
	
	//attributes
	private int emID;
	private String name;
	private String gender;
	private int age;
	
	//constructor
	public Employee(int emID, String name, String gender, int age) {
		this.emID = emID;
		this.name = name;
		this.gender = gender;
		this.age = age;
		
	}
	
	//methods start here
	public int getEmployeeID() {
		return emID;
	}
	
	public int setEmployeeID(int emID) {
		return emID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	 
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//display all the attributes of the employee
	public void displayEmployeeInfo() {
		System.out.println("Employee Id: " + emID);
		System.out.println("Employee Id: " + name);
		System.out.println("Employee Id: " + gender);
		System.out.println("Employee Id: " + age);
	}
}
