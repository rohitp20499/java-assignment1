package FirstProblem;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private String branch;
	
	public Employee(){
		System.out.println("Employee()");
	}
	
	public Employee(int id, String name, String dept, String branch){
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.branch = branch;
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee setId(int id){
		this.id = id;
		return this;
	}
	
	public Employee setName(String name){
		this.name = name;
		return this;
	}
	
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void display(){
		System.out.println("Employee ID:"+this.id+" Name:"+this.name+" Dept:"+dept+" Brnahc:"+branch);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
