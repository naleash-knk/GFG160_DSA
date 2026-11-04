class Solution:
    def missingNumber(self, arr):
        n = len(arr)
        
        freq = [False]*(n+2)
        
        for num in arr:
            if num>0 and num<=n and not freq[num]:
                freq[num]=True
        
        s = 1
        while freq[s]:
            s+=1
        
        return s