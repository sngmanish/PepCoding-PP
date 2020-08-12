import java.util.*;
/**
 * Any_base_Addition
 */
public class Any_base_Addition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt(); 
        int base = scn.nextInt();
        int answer = 0;
        int carry = 0;
        int power = 1;
        while(n1 > 0 || n2 > 0 || carry > 0){
          int d1 = n1 % 10;
          n1 = n1 / 10;
          int d2 = n2 % 10;
          n2 = n2 / 10;
  
          int d = d1 + d2 + carry;
          carry = d / base;
          d = d % base;
          answer += d * power;
          power = power * 10;
    }
    System.out.print(answer);
    scn.close();
}
}
