class Solution {
    public int majorityElement(int[] nums) {
        
        int result = 0, count = 0;
        for(int n : nums){
            if(count == 0){
                result = n;
            }
            count += (n == result? 1:-1);
        }
        // for(int i =0; i<nums.length;i++){
        //     if(count == 0){// Chua tim duoc thi result = nums[i] hien tai
        //         result = nums[i];
        //     }
        //     if(nums[i] == result){
        //         count++;
        //     }else {
        //         count--;
        //     }
        // }
        return result;
    }
}