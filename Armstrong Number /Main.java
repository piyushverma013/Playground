
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner obj = new Scanner(System.in);
      int num, new_num, digit = 0, arm = 0, rem ;
      num = obj.nextInt();
      
      new_num = num;
      while(new_num != 0)
      {
        digit++;
        new_num/= 10;
      }
      
      new_num =num;
      while(new_num != 0)
      {
        rem = new_num % 10;
        arm = arm + power(rem, digit);
        new_num/= 10;
      }
      
      if(num == arm)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
  
  static int power(int rem, int digit)
  {    int result = 1;
    for(int i = 1; i <= digit; i++)
        {
            result = result * rem;
        }
        return result;
   }
}

