class Solution {
    public int maxRotateFunction(int[] nums) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < nums.length; i++){
            a += (nums[i] * i);
            b += nums[i];
        }

        int max = a;
        int n = nums.length;
        for(int i = n - 1; i >= 1 ; i--){
            a = a + b - n * nums[i];
            max = Math.max(max , a);
        }
      return max;
    }
}