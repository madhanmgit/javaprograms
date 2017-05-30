
	public class Employee {
	 
	    
	    int employeeId;
	    String employeeName;
	 
	    
	    static String ORGANIZATION_NAME = "ABC Pvt. Ltd.";
	 
	    
	    Employee(int employeeId, String employeeName) {
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	    }
	 
	    
	    void displayEmployeeInfo() {
	        System.out.println(employeeId + "\t" + employeeName + "\t" + ORGANIZATION_NAME);
	    }
	 

	    public static void main(String[] args) {
	 
	        
	        Employee employee1 = new Employee(1001, "Tom");
	        Employee employee2 = new Employee(1002, "Harry");
	 
	        
	        employee1.displayEmployeeInfo();
	        employee2.displayEmployeeInfo();
	    }
	}


