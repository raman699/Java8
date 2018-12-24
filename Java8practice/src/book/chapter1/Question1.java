package book.chapter1;

public class Question1 {


    public static void main(String[] args) {
	Employee1 e1=new Employee1();
	e1.employeeId=101;
	Employee1 e2=new Employee1();
	e2.employeeId=101;
	if(e1.equals(e2)) {
	    System.out.println("Success");
	}
	else{
	    System.out.println("Failure");
	}

    }

}
class Employee1 {
    public int employeeId;
    public String firstName,lastName;
    public int yearStarted;
    @Override public int hashCode(){
	return employeeId;
    }
    public boolean equals(Employee1 e){
	return this.employeeId==e.employeeId;
    }

}
