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
      int search_elem_1 = obj.nextInt();
      int search_elem_2 = obj.nextInt();
      int elem1 = -1;
      int elem2 = -1;
      
      for(int i = 0; i < n; i++)
      {
           if(search_elem_1  == arr[i])
           {
             elem1 = i;
           }
          if(search_elem_2  == arr[i])
           {
            elem2 = i;
           }
       
        
      }
           System.out.println(elem1);
           System.out.println(elem2);

    
      }
      
    }
