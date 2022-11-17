class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);  //reverse whole array
        reverse(nums, 0, k-1);  //reverse array from 0 to k-1 
        reverse(nums, k, nums.length-1);  //reverse array from k to nums.length-1
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
