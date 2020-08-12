import java.util.*;
      
      public class pattern11{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int stars =1;
          int count =1;

            
         for (int r =1; r <=n; r++){
             for (int c = 1; c<=stars; c++){
             System.out.print(count +"\t");
             count ++;
             }
             stars++;
             
             System.out.println();
             
            scn.close(); 
         }
         count ++;
        }
    }