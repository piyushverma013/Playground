import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      System.out.println(sum(n));
      
	}
  
  public static int sum( int num)
  {   int sum = 0,i= 1;
      while(i<=num)
      {
     
        sum+= i;
         
        i++;
      }
    
    return(sum);
  }
}