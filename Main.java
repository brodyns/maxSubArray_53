public class Main {
    public static void main(String[] args) {
        int[] nums ={-2, -1};
        System.out.println((new Solution()).maxSubArray(nums));
    }
}

class Solution{
    public int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(cur < 0) cur = 0;
            cur = Math.max(cur+nums[i], nums[i]);
            if(cur > maxSum) maxSum = cur;
        }
        return maxSum;
    }
}
