package LAB23FEB;

class Employee { // parent class
	int IncrementSalary () { //marks is a method of parent class
		return 0;
	}}
class Developer extends Employee { // child class 1 comp
	int IncrementSalary () {  //same name method as per parent
		return 20000;
	}}
class Manager extends Employee { // child class 1 <at
	int IncrementSalary () {  //same name method as per parent
		return 7000;
	}}
class Overriddingeg3{
	public static void main (String args[] ) {
		//comp c=new comp();
		//math m =new math();
	//	science c=new comp();
		Employee employee;// parent class reference point
		employee=new Developer();
		System.out.println(employee.IncrementSalary ());
		employee=new Manager();
		System.out.println(employee.IncrementSalary ());
		
	}

}

