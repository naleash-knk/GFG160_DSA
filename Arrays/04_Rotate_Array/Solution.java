
import java.util.*;

class Solution {
    public void rotateArr(int arr[], int d) {
       int moves = d%arr.length;
       
       Queue<Integer> coll = new LinkedList<>();
       for(int num:arr) coll.offer(num);
       
       while(moves>0){
           coll.offer(coll.poll());
           moves--;
       }
       
       int i=0;
       for(int num:coll){
           arr[i]=num;
           i++;
       }
        
    }
}