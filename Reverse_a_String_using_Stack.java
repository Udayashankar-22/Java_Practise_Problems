import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "UdayaYuva";
        Stack<Character> st = new Stack<>();
        Stack<Character> rev = new Stack<>();
        for(char ch:str.toCharArray()){
            st.push(ch);
        }
        while(!st.isEmpty()){
            rev.push(st.pop());    
        }
        while(!rev.isEmpty()){
            System.out.print(rev.pop()+" ");
        }
    }
}