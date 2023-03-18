package LAB16Feb;

class A{ 
	void a(){
		System.out.println("It is the base class of B");
	}
}
class B extends A{ 
	void b() {
		System.out.println("It is the base class of C");
	}
}

public class Multilevel extends B{ 
	void c() { 
		System.out.println("It is derived class from base class B");
	}
	public static void main(String[] args) {
		Multilevel obj=new Multilevel();
		obj.a(); 
		obj.b(); 
		obj.c(); 		
		}
	}
