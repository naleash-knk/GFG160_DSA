class Solution:
    def findMajority(self, arr):
        occ = len(arr)/3
        freqMap = dict()
        
        for i in arr:
            freqMap[i]=freqMap.get(i,0)+1
            
        lst = []
        
        for key,val in freqMap.items():
            if val > occ:
                lst.append(key)
        
        lst.sort()
        
        return lst
        