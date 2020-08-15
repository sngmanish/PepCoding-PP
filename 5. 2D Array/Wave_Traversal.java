import java.util.*;

/**
 * Wave_Traversal
 */
public class Wave_Traversal {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        int m =scn.nextInt();
        int [][]  arr = new int [n][m];
        // taking input 1st matrix  
        for (int i =0; i<n ;i++){
            for (int j =0; j<m ;j++){
              arr[i][j] = scn.nextInt();  
            }   
        }
        for (int j =0; j<arr[0].length ;j++){
            if (j%2==0) // even row me rows are increasing 
            {
                for (int i =0; i<arr.length ;i++){
                    System.out.println(arr[i][j]);  
                }
            }
            else {
                for (int i =arr.length-1; i>=0 ;i--){
                    System.out.println(arr[i][j]);  
                }
            }     
        }
        scn.close();
    }
}