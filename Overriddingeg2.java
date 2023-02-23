package LAB23FEB;

class Bank { // parent class
	int interest () { //marks is a method of parent class
		return 0;
	}}
class Sbi extends Bank { // child class 1 comp
	int interest () {  //same name method as per parent
		return 8;
	}}
class Icici extends Bank { // child class 1 <at
	int interest () {  //same name method as per parent
		return 7;
	}}
class Axis extends Bank { // child class 1 <at
	int interest () {  //same name method as per parent
		return 9;
	}}

class Overriddingeg2{
	public static void main (String args[] ) {
	
		Bank bank;// parent class reference point
		bank=new Sbi();
		System.out.println("Sbi" +"  "+bank.interest()+ "%");
		bank=new Icici();
		System.out.println("Icici" +"  "+bank.interest()+ "%");
		bank=new Axis();
		System.out.println("Axis" +"  "+bank.interest()+ "%");
		
	}

}
