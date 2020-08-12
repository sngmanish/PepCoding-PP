import java.util.*;
      
      public class pattern13{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();    
         for (int i =0; i <n; i++){
            int ivalue =1 ;
             for (int j = 0; j<=i; j++){
             System.out.print( ivalue  +"\t");
             int nivalue =  ivalue* (i-j)/(j+1);
             ivalue = nivalue;
             }
             System.out.println();
            scn.close(); 
         }
         
        }

    }