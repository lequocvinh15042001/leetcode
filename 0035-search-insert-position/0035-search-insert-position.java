class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        
        while(low < high){
            int mid = low + (high - low)/2; // 0,1,2,3,4, --> 0 + (4-2)/2 = 2 --> mid position
            if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        
        return low;
    }
}