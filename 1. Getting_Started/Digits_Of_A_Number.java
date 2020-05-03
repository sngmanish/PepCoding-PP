/**
 * Digits_Of_A_Number
 */
import java.util.*;
public class Digits_Of_A_Number {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int power =1;
      int temp=n;
      while (temp>=10){
          temp/=10;
          power*=10;
      }
      temp=n;
      while (power!=0){
          int digit = temp/power;
          System.out.println(digit);
          temp %= power;
          power/=10;
      }
      scn.close();
     }
    }

