import java.util.*;
/**
 * Difference_of_two_array
 */
public class Difference_of_2_array {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n1 = scn.nextInt();
        int [] a1 = new int[n1];
        // content 1
        for (int i =0; i<a1.length ;i++){
            a1[i] = scn.nextInt();    
        }
        int n2 = scn.nextInt();
        int [] a2 = new int[n2];
        // content2
        for (int i =0; i<a2.length ;i++){
            a2[i] = scn.nextInt();    
        }


        // we are doing n2-n1
        int[] diff = new int[n2];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;
        int c = 0;
        while(k >= 0){
           int v;
    
           if(i >= 0){
             v = a1[i];
           } else {
             v = 0;
           }
    
           if(a2[j] + c >= v){
             diff[k] = a2[j] + c - v;
             c = 0;
          } else {
            diff[k] = a2[j] + c + 10 - v;
            c = -1;
          }
    
           i--;
           j--;
           k--;
        }
    
        int idx = 0;
        // pehle ke zeroes print nahi honge 
        while(idx < diff.length){
          if(diff[idx] != 0){
            break;
          } else {
            idx++;
          }
        }
       
         // bich vaale honge, to baaki saare number print krdo
        while(idx < diff.length){
          System.out.println(diff[idx]);
          idx++;
        }
        scn.close();
    }
}
