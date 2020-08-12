import java.util.*;
/**
 * Any_base_Subtraction
 */
public class Any_base_Subtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //n2-n1
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int base= scn.nextInt();
        
       int answer = 0;
       int carry = 0;
       int power = 1;
       while(n2 > 0){
          int d1 = n1 % 10;
          int d2 = n2 % 10;
          n1 = n1 / 10;
          n2 = n2 / 10;
         
         // settling up the carry
          int d =  0;
          d2 = d2 + carry; 

        //  condition whether carry wanted of not
          if(d2>= d1){
              carry = 0;
              d = d2-d1 ;
          } else {
              carry = -1;
              d =d2+ base -d1;
          }
  
          answer += d * power;
          power = power * 10;
       }
       System.out.print(answer);
       scn.close();
  
       

    }
}