package Lab9Mar;

public class Array_lab1 {
	static void  pairs(int inputnum[], int inputsum) {
	  System.out.println("Pairs of elements and their sum : ");
	  for (int i =  0; i < inputnum.length; i++){
	  for (int j  = i+1; j < inputnum.length; j++)
	  {
	  if(inputnum[i]+inputnum[j] == inputsum)
	  {
	  System.out.println(inputnum[i]+" + "+inputnum[j]+" =  "+inputsum);
	  }
	  }
	  }
	}
	  public static void  main(String[] args) {
	  pairs(new int[] {1,3,4,5,2,6,7,8},10);
	  }
}
