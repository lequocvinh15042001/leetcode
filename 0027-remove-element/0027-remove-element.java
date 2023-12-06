class Solution {
    
    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int boudary = nums.length - 1;
        while(i <= boudary){
            if(nums[i] == val){
                swap(nums, i, boudary);
                boudary--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}