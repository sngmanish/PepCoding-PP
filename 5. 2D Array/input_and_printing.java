import java.util.*;
/**
 * input_and_printing
 */
public class input_and_printing {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        int m =scn.nextInt();
        int [][]  arr = new int [n][m];
        // taking input 
        for (int i =0; i<n ;i++){
            for (int j =0; j<m ;j++){
              arr[i][j] = scn.nextInt();  
            }   
        }
        // printing 
        for (int i =0; i<n ;i++){
            for (int j =0; j<m ;j++){
              System.out.print(arr[i][j]);
            }   
            System.out.println();

        }   
scn.close();    

    }
}

// rows could be written as a.length column could be written as a[0].length