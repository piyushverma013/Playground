import java.util.Scanner;
 class Main
{
   public static void main(String args[])
   {
       Scanner obj = new Scanner(System.in);
       int base, exponent;
       base = obj. nextInt();
       exponent = obj.nextInt();
       System.out.println(power(base, exponent));
   }          
  
  public static int power(int base, int exponent)
  {
        int result = 1;
        for(int i =1; i <= exponent; i++)

        {
                 result = result * base;

        }
                  return result; 
  }
}
             




