class Solution {
    public int getSecondLargest(int[] arr) {
        int largest_element = -1;
        int sec_large_value = -1;
        
        for(int num:arr){
            if(num>largest_element){
                sec_large_value = largest_element;
                largest_element = num;
            }
            else if(num>sec_large_value && num!=largest_element){
                sec_large_value = num;
            }
        }
        return sec_large_value;
    }
}