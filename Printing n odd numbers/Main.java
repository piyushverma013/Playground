import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int i, n, a;
      Scanner obj =new Scanner(System.in);
      n = obj.nextInt();
      a = n + n;
   
      for(i=1; i<=a; i++)
      {
          if(i%2==1)
          {
            System.out.println(i);
            //System.out.println(2*i-1);

          }
      }


	}
}