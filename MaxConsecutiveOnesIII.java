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
/*Eplacaton of while loop: While loop gets invoked when zeroCounter is
greater than 2 in our case when right reach at index 5 our zeroCounter
would be at 3 which we dont want becasuse k=2 (utmost two means 2 or
less zeros are only acceptable). Now we will get into Loop in loop we have
if statement which is starting from Left=0 index. At this index
we have one thus we cant reduce our zeroCounter, thus we will just
increment left by one we will keep incrementing left untill we find
a zero once we find zero in our array as we are moving towards right
we will reduce our zeroCounter by one and increment of left pointer.
This time our zeroCount will be equal to 2 and our k is also 2.
This 2 cant be greater than true. Its false thats why we will get out
of our while loop. At this point our left pointer is staring at index 4 and right
pointer at index 6 and zeroCounter at 2.
At this point the code will go back to right loop and at this time the
right will check what is at index 6 which is one thus we will keep moving
with right loop unless we get to last index where we found 0 again.
This will increment our zeroCounter by one remember we had our zeroCounter
which is standing at 2 which is not again incrementd to 3 which is greater than
our k=2 thus;
we will again get into our while loop which will check what we have at
left index = 4 which is also zero thus again counter will be reduced by
1 and left will be increated by one now left is standing at 5 index and
Since now right loop is fully exusted thus now we would end up having the
longest sunArray which has atmost 2 zeros.
Thus the length of our longest subArray would be = right -left +1=10-5+1=6


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
