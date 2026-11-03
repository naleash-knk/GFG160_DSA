class Solution:
	def maxProduct(self, arr)->int:
		max_prod = arr[0]
		min_prod = arr[0]
		res = arr[0]
		
		for i in range(1,len(arr)):
		    x = arr[i]
		    
		    old_max = max_prod
		    old_min = min_prod
		    
		    max_prod = max(x,x*old_max,x*old_min)
		    min_prod = min(x,x*old_max,x*old_min)
		    
		    res = max(max_prod,res)
		
		return res;
		


		