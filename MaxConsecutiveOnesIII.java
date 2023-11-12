public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxOnes = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) { //Key Area of concentration
                if (nums[left] == 0) {//
                    zeroCount--;
                }
                left++;
            }
/*
We are only concerned with sliding of windown and the window start
point and end point will give us our answer. Now the logic is
depending on the constraint. Depending on logic window will move.
For example line 13 to 17. Out constrains is number of zeros not to ex
ceed 1 if it exceeds then then we have to interupt. Since its okay to
have one 0 because we can flip it to one but if number of zeros are
greater than 1 lets say two then we have to reduce our zero counter
by one and slide our window to the right from left by incrementing
left. if we kept doing this
 */
            // Update the maximum consecutive ones
            maxOnes = Math.max(maxOnes, right - left + 1);
        }

        return maxOnes;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
