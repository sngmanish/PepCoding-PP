import java.util.*;
/**
 * Saddle_Point
 */
public class Saddle_Point {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        int [][]  arr = new int [n][n];
        // taking input 
        for (int i =0; i<arr.length ;i++){
            for (int j =0; j<arr[0].length ;j++){
              arr[i][j] = scn.nextInt();  
            }   
        }
        scn.close(); 
        // checking 
        for (int i =0; i<arr.length ;i++){
            int leastvalj =0; 
            for (int j =1; j<arr[0].length ;j++){
              if (arr[i][j]  < arr[i][leastvalj]){
                  leastvalj =j;
              }
            }   
            // now check if is max in column or not 
            //now rows will vary
            boolean flag =true;

            for (int k =0; k<arr[0].length ;k++){
                if (arr[k][leastvalj]  > arr[i][leastvalj]){
                    flag =false;
                    break;
                }
              }   
             
             if (flag == true){
                  System.out.println(arr[i][leastvalj]);  
                  return;
              }
        }
        System.out.println("Invalid Output");

          
    }
}