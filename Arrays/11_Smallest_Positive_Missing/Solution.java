
import java.util.Arrays;

class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        boolean[] freq = new boolean[n+2];
        Arrays.fill(freq,false);
        
        for(int num:arr){
            if(num>0 && num<=n && !freq[num]) freq[num]=true;
        }
        
        int s = 1;
        
        while(freq[s])s++;
        
        return s;
    }
}
