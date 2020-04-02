import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      System.out.println(square(n));
	} 
  
  public static int square(int num)
  {
      return(num*num);
  }
  
}