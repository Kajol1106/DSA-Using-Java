class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int temp = 0;
        for(int i=0; i<nums.length; i++) {
            temp += nums[i];
            sum[i] = temp;
        }
        
        return sum;
    }
}
