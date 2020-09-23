package question_4;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private double sal;
	
	
	public static int compareBySal(Employee e1,Employee e2 ) {
		// TODO Auto-generated method stub
		if(e1.getSal()<e2.getSal())
			return 1;
		if(e1.getSal()>e2.getSal())
			return -1;
		return 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(int id, String name, String address, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}
	


}
