import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int n, sum = 0;
      Scanner obj = new Scanner(System.in);
            n = obj.nextInt();
      
      for(int i=1; i<=n; i++)
      {
         sum+=i;
        
      }
      System.out.print(sum);
	}
}