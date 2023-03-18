package LAB23FEB; // Overridding
class Exam { // parent class
	int marks () { //marks is a method of parent class
		return 0;
	}}
class comp extends Exam { // child class 1 comp
	int marks () {  //same name method as per parent
		return 80;
	}}
class math extends Exam { // child class 1 <at
	int marks () {  //same name method as per parent
		return 70;
	}}
class science extends Exam { // child class 1 <at
	int marks () {  //same name method as per parent
		return 50;
	}}
class eng extends Exam { // child class 1 <at
	int marks () {  //same name method as per parent
		return 90;
	}}
class Overriddingeg{
	public static void main (String args[] ) {
		//comp c=new comp();
		//math m =new math();
	//	science c=new comp();
		Exam exam;// parent class reference point
		exam=new science();
		System.out.println(exam.marks ());
		exam=new eng();
		System.out.println(exam.marks ());
		
	}

}
