
import java.util.*;

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int occ = arr.length/3;
        
        Map<Integer,Integer> freqs = new HashMap<>();
        ArrayList<Integer> lst = new ArrayList<>();
        
        for(int val:arr){
            freqs.put(val,freqs.getOrDefault(val,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry:freqs.entrySet()){
            if(entry.getValue()>occ){
                lst.add(entry.getKey());
            }
        }
        
        Collections.sort(lst);
        
        return lst;
    }
}