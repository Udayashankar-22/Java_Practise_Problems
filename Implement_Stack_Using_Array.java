import java.util.*;
class StackArray{
    int[] arr = new int[5];
    int top=-1;
    void push(int data){
        if(top==arr.length-1)System.out.print("Stack Overflow");
        else 
        arr[++top]=data;
    }
    void pop(){
        if(top==-1)System.out.print("Stack Underflow");
        else
        System.out.print("Popped "+arr[top--]+" ");
    }
}
public class Implement_Stack_Using_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StackArray sta = new StackArray();
        sta.push(1);
        sta.push(2);
        sta.push(3);
        sta.push(4);
        sta.push(5);
        sta.pop();
    }
}