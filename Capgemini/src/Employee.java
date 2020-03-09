public class Employee {
	int empId;
	Employee(int eid){
		empId=eid;
	}
}

class ContractEmployee extends Employee{
	ContractEmployee(){
		super(10);
		System.out.println(empId);
	}
}

public class Starter{
	public static void main() {
		ContractEmployee ce= new ContractEmployee;
	}
}