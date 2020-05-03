
/**
 * Count_Digits_In_A_Number
 */
import java.util.*;
public class Count_Digits_In_A_Number {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int remainder,sum=0;
    int n =scn.nextInt();
    
    while (n>0) {
        remainder = n%10;
        sum = sum + remainder;
        int digit = n%10;
        n = n/10;
        System.out.println(digit);
        }
    
        scn.close();
   }
   
  }

  
