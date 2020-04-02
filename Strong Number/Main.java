import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner obj =new Scanner(System.in);
      int n, num, rem, sum = 0 ;
     
      
      n = obj.nextInt();
      num = n;
      
      while(n>0)
      {     
            rem = n % 10;
            int fact = 1;
            for( int i = 1; i <= rem; i++)
            {
                 fact = fact * i;
            }
            
           sum = sum + fact;
           n/= 10;
      }
      
      if (num == sum)
        System.out.println("Yes");
      else
        System.out.println("No");
      
            
	}
}