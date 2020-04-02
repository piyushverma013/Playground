import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner obj = new Scanner(System.in);
      int n, fact = 1;
      n = obj.nextInt();
      for(int i = 1; i <= n; i++)
      {
          fact = fact * i;
      }
      System.out.print(fact);
	}
}