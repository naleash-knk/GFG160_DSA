class Solution:
    def rotateArr(self, arr, d):
        d%=len(arr)
        arr [:] = arr[d:] + arr[:d]
        

"""
class Solution:
    def rotateArr(self, arr, d):
        moves = d%len(arr)
        
        while moves>0:
            arr.append(arr.pop(0))
            moves-=1
"""