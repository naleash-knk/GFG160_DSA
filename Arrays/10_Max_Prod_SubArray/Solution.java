class Solution {
    int maxProduct(int[] arr) {
        long max_prod = arr[0];
        long min_prod = arr[0];
        long res = arr[0];
        
        for(int i=1;i<arr.length;i++){
            long x = arr[i];
            
            long old_max = max_prod;
            long old_min = min_prod;
            
            max_prod = Math.max(x,Math.max(x*old_max,x*old_min));
            min_prod = Math.min(x,Math.min(x*old_max,x*old_min));
            
            res = Math.max(res,max_prod);
        }
        
        return (int)res;
        
    }
}