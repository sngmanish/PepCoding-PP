import java.util.*;
/**
 * Balanced_Brackets
 */
public class Balanced_Brackets {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        System.out.println(isBalanced(exp));
        scn.close();
    }
    
    public static boolean isBalanced(String exp){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch==')'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='{'){
                    st.pop();
                }
            }
            else if(ch==']'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='['){
                    st.pop();
                }
            }
            else{
                if(ch=='(' || ch=='{' || ch=='['){
                    st.push(ch);
                }
            }
        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

}