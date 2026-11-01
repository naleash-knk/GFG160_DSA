

class Solution:
	def pushZerosToEnd(self, arr: list[int]) -> None:
		j=0

		for i in range(len(arr)):
			if arr[i]!=0:
				temp = arr[i]
				arr[i] = arr[j]
				arr[j] = temp
				j+=1