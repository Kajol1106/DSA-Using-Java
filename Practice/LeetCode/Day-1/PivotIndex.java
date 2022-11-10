// The pivot index is the index where the sum of all the numbers 
// strictly to the left of the index is equal to the sum of all the 
// numbers strictly to the index's right.


class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right;
        for(int i=0; i<nums.length; i++) {
            right = 0;
            for(int j=i+1; j<nums.length; j++) {
                right += nums[j];
            }

            if(left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
