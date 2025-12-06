import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(obj.nextInt());
        }
        for(int i=0;i<m;i++){
            pq.add(obj.nextInt());
            System.out.print(pq.peek());
            if(i<m-1)System.out.print(" ");
        }
        
    }
}