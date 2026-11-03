import java.util.Arrays;

class Solution {
    public int getMinDiff(int[] arr, int k) {
        
        int n = arr.length;
        Arrays.sort(arr);
        
        int min_diff = arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++){
            if((arr[i]-k)<0) continue;
            
            int min_val = Math.min(arr[0]+k,arr[i]-k);
            int max_val = Math.max(arr[i-1]+k,arr[n-1]-k);
            
            int diff = max_val-min_val;
            
            min_diff = Math.min(min_diff,diff);
            
        }
        
        return min_diff;
        
    }
}
