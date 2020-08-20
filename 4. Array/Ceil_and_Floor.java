import java.util.*;
/**
 * Ceil_and_Floor
 */
public class Ceil_and_Floor {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<arr.length ;i++){
                arr[i] = scn.nextInt();    
            }
        int data = scn.nextInt();
        int low =0 ;
        int high= arr.length;
        int ceil =0, floor =0;
        while (low <= high){
            int mid = (low + high) /2;
            if (data<arr[mid]){
            high = mid -1;
            ceil = arr[mid];
            }
            else if (data > arr[mid]){
                low = mid +1;
                floor = arr[mid];

            }
            else{
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }
       System.out.println(ceil);
       System.out.println(floor);
       scn.close();


    }
}