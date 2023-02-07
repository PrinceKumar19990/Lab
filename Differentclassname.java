package Constructor;

public class Differentclassname {
  int age;
  String name;
  void show()  {//method to display age and name (user define)
	System.out.println(age+ "  " +name);}
	public static void main(String[] args) {
		// 1st object for name & age
		Differentclassname  d=new Differentclassname();
		//2nd object for name & age
		Differentclassname  d1=new Differentclassname();
		d.show();
		d1.show();
		Differentclassname d3=new Differentclassname();
		d3.age=70;
		d3.name="Hello world";
		System.out.println(d3.age+d3.name);
				

	}

}
