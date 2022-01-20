package demo.model;

public class Employee {

	
	public Employee(int employeeId, int age, String name, String city, String gender) {
		super();
		this.employeeId = employeeId;
		this.age = age;
		this.name = name;
		this.city = city;
		this.gender = gender;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	private int employeeId;
	private int age;
	private String name;
	private String city;
	private String gender;
	
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
