package book.chapter1;

class Employee{
    int empId;
    String name;
    Employee(int empId,String name){
	this.empId=empId;
	this.name=name;
    }
    //this is the bad implementation of equals method
    @Override
    public
    boolean equals(Object obj){
	return true;
    }

}
public class EqualsMethodCheck {

    public static void main(String[] args) {
	Student s1=new Student(1,"raman");
	Student s2=new Student(2,"gaagn");
	Student s3=new Student(1,"gaagn");
	if(s1.equals(s2)){
	    System.out.println("Student are same");
	}
	else{
	    System.out.println("Student are different");
	}
	if(s1.equals(s3)){
	    System.out.println("Student are same");
	}
	else{
	    System.out.println("Student are different");
	}
	Employee emp1=new Employee(1,"raman");
	Employee emp2 =new Employee(2,"gagan");
	System.out.println(emp1.equals(null));
	//if you see this will give bad result
    }

}
class Student{
    String name;
    int rollno;
    Student(int rollno,String name){
	this.rollno=rollno;
	this.name=name;
    }
    @Override
    public boolean equals(Object obj){
	//this is a good practice checking whether it is a good type of object or not
	if(obj instanceof Student){
	    Student student=(Student)obj;
	    if(this.rollno==student.rollno){
		return true;
	    }
	    else{
		return false;
	    }
	}
	else{
	    return false;
	}
    }
}
//java does give a set of rules to be followed as a contract if you want to override equals
//method ,but if don't follow it will not give a compiler error'