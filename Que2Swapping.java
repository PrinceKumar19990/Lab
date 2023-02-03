package LAB;

import java.util.Scanner;

public class Que2Swapping {

	public static void main(String[] args) {
	int ram,syam,interchange;
	System.out.println("Enter the two number");
	Scanner r=new Scanner(System.in);
	int a = r.nextInt();
	int b =r.nextInt();
	System.out.println("Before swaping"+ a+" "+b);
	interchange=a;
	a=b;
	b=interchange;
	System.out.println("After swapping"+a+" "+b);
	
	}

}
