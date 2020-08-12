import java.util.*;
/**
 * Sum_of_two_Array
 */
public class Sum_of_two_Array {

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

        int[] sum = new int[n1 > n2? n1: n2];


        // int c = 0;
        // for (int i =a1.length-1 ; i>= 0 ;i--){
        //     for (int j = a2.length ; j>= 0 ; j--){
        //         for (int k =sum.length-1 ; k>= 0 ; k--){
        //             int d= c+a1[i]+a2[j];
        //             c = d / 10;
        //             d = d % 10;
        //             sum[k] = d;

        //         }

        //     }

        // }
        // if(c > 0){
        //     System.out.println(c); 
        //  }
        //  for(int i=1 ; i<=sum.length; i++){   
        //     System.out.println(sum[i]);
        //  }

        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;
        int c = 0;
        while(i >= 0 || j >= 0){
         int d = c;

         if(i >= 0)
          d += a1[i];

         if(j >= 0)
          d += a2[j];

          c = d / 10;
          d = d % 10;
          sum[k] = d;
          i--;
          j--;
          k--;
    }

    if(c > 0){
       System.out.println(c); // if carry is left
    }
    for(int val: sum){   //give all the values store in array val:sum
       System.out.println(val);
    }
    scn.close();
        }
    }
