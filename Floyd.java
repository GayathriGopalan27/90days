package day1;

public class Floyd {
	
	public static void main(String[] args) {
	//initialize number  and rows	
      int num =1;
      int rows=7;
      for (int i =1; i<=rows;i++)
      {
    	  //reinintialize number to 1 to get the 123 format else not required 
    	  num=1;
    	  for (int j=1;j<=i;j++)
    	  {
    		  //print the number 
    	        System.out.print(num+" ");
    	        num++;
    	  }
          System.out.println();
      }
	}
}
      