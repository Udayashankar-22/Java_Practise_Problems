import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "[{()]}";
        Stack<Character> st = new Stack<>();
        boolean bal = true;
        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else {
                if(st.isEmpty()){
                    bal=false;
                    break;
                }
                char top = st.pop();
                if(ch==')' && top!='('|| ch=='}' && top!='{' || ch==']' && top!='[' ){
                    bal = false;
                    break;
                }
            }
        }
        if(!st.isEmpty())bal=false;
        System.out.print(bal?"Balanced":"Not Balanced");
        
    }
}