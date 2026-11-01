class Solution:
    def getSecondLargest(self, arr:list[int])->int:
        
        large_val = -1
        sec_large = -1
        
        for num in arr:
            if num>large_val:
                sec_large=large_val
                large_val=num
            elif num>sec_large and num!=large_val:
                sec_large=num
        
        return sec_large


    
        