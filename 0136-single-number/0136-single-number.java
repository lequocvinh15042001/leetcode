class Solution {
    public int singleNumber(int[] nums) {
        
        int ans = nums[0];
        for(int i=1; i<nums.length;i++){
            ans ^= nums[i];//phép XOR nếu giống nhau thì kq=0, khác thì =1, dùng để loại bỏ các số giống nhau
        }
        return ans;
    }
}