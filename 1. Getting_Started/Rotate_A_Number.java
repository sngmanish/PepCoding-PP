/**
 * Rotate_A_Number
 */

import java.util.*;
public class Rotate_A_Number {
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int num = scn.nextInt();
           int rotate = scn.nextInt();
   
           int nod = 0;
           int temp = num;
           while(temp != 0){
               temp /= 10;
               nod++;
           }
   
           rotate = rotate % nod;
           if(rotate < 0)
               rotate += nod;
   
           int div = 1;
           int mult = 1;
           for(int i = 1; i <= nod; i++){
               if(i <= rotate)
                   div *= 10;
               else 
                   mult *= 10;
           }
   
           int q = num / div;
           int re = num % div;
   
           int r = re * mult + q;
           System.out.println(r);
       scn.close();
          }

   }

  
