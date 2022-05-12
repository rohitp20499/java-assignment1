package FirstProblem;

public class EmployeeUtil {

	public EmployeeUtil() {
		
	}
	
	//#1.sorting method
	public Employee[] sort(Employee[] aemp){
		for(int i=0;i<aemp.length;i++){
			for(int j=0;j<aemp.length - i -1;j++){
				if(aemp[j].getBranch().compareTo(aemp[j+1].getBranch())>0){
					Employee etmp = aemp[j];
					aemp[j] = aemp[j+1];
					aemp[j+1] = etmp;
				}
			}
		}
		
		return aemp;
	}
	
	//#2.reverse method using recursion
	public static void reverse(Employee[] aer,int index) {
		int len = aer.length;
		if(index<len/2) {
				Employee temp = aer[index];
				aer[index] = aer[len-index-1];
				aer[len-index-1] = temp;
				reverse(aer, index+1);
		}
		
	}
	
	//#3.Displaying 2D array elements
	public static void display(Employee[][] aemp) {
		System.out.println("Printing the elements of 2D array : ");
		for(int i=0;i<aemp.length;i++) {
			for(int j=0;j<aemp.length;j++) {
				aemp[i][j].display();
			}
		}
	}
	public static void main(String[] args) {
		Employee aemp[] = new Employee[8];

		aemp[0] = new Employee(1, "name1", "dept1", "branch3");
		aemp[1] = new Employee(2, "name2", "dept2", "branch1");
		aemp[2] = new Employee(5, "name5", "dept3", "branch2");
		aemp[3] = new Employee(6, "name6", "dept4", "branch1");
		aemp[4] = new Employee(7, "name7", "dept5", "branch3");
		aemp[5] = new Employee(8, "name8", "dept6", "branch2");
		aemp[6] = new Employee(9, "name9", "dept7", "branch1");
		aemp[7] = new Employee(10, "name10", "dept8", "branch3");

		EmployeeUtil eutil = new EmployeeUtil();
		eutil.sort(aemp);
		System.out.println("Sorted array is : ");
		for(Employee ae : aemp) {
			System.out.println("Id : "+ae.getId()+" Name : "+ae.getName()+" Dept : "+ae.getDept()+" Branch : "+ae.getBranch());
		}
		reverse(aemp,0);
		System.out.println("Reversed array is :");
		for(Employee emp : aemp) {
			emp.display();
		}
		
		Employee[][] aep = new Employee[3][3];
		aep[0][0]=aemp[0];
		aep[0][1]=aemp[1];
		aep[0][2]=aemp[2];
		aep[1][0]=aemp[3];
		aep[1][1]=aemp[4];
		aep[1][2]=aemp[5];
		aep[2][0]=aemp[6];
		aep[2][1]=aemp[7];
		aep[2][2]=new Employee(3, "name3", "dept9", "branch2");
		display(aep);
	}
	
	
}
