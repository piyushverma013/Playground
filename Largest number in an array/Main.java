import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
           arr[i] = obj.nextInt();
      }
      
      int max_elem = 0;
      for(int i = 0; i < n; i++)
      {
           if(max_elem < arr[i])
           {
             max_elem = arr[i];
           }
       }
      System.out.println(max_elem);
      
    }
  
 }