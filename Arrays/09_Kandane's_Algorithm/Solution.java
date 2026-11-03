class Solution {
    int maxSubarraySum(int[] arr) {
        int max_sum = arr[0];
        int curr_sum = arr[0];
        
        for(int i=1;i<arr.length;i++){
            curr_sum=(curr_sum+arr[i])>arr[i]?(curr_sum+arr[i]):arr[i];
            max_sum=curr_sum>max_sum ? curr_sum : max_sum;
        }
        
        return max_sum;
        
    }
}
