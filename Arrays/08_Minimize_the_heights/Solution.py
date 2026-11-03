class Solution:
    def getMinDiff(self, arr, k)->int:
        n = len(arr)
        arr.sort()
        
        min_diff = arr[n-1]-arr[0]
        
        for i in range(1,n):
            if (arr[i]-k)<0:
                continue;
            
            min_val = min(arr[0]+k,arr[i]-k)
            max_val = max(arr[i-1]+k,arr[n-1]-k)
            
            diff = max_val-min_val
            
            min_diff = min(min_diff,diff)
        
        return min_diff