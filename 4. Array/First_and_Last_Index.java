import java.util.*;
/**
 * First_and_Last_Index
 * using binary Search
 */
public class First_and_Last_Index {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
            int n = scn.nextInt();
            int [] arr = new int[n];
            for (int i =0; i<arr.length ;i++){
                arr[i] = scn.nextInt();    
            }
             int data = scn.nextInt();

            //  cal last index
            int low =0 ;
            int high= arr.length;
            int li =0;
            while (low <= high){
                int mid = (low + high) /2;
                if (data<arr[mid]){
                high = mid -1;
                
                }
                else if (data > arr[mid]){
                    low = mid +1;
                    
    
                }
                else{
                    li = mid;
                    low=mid+1;
                    break;
                }
            }
            //cal first index
            low =0 ;
            high= arr.length;
            int fi =0;
            while (low <= high){
                int mid = (low + high) /2;
                if (data<arr[mid]){
                high = mid -1;
                
                }
                else if (data > arr[mid]){
                    low = mid +1;
                    
    
                }
                else{
                    fi = mid;
                    high=mid-1;
                    break;
                }
            }
        System.out.print(fi);
        System.out.print(li);
        scn.close();
    } 
}