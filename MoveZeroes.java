public class MoveZeroes {
    public static void moveZeroes(int[] nums) {

        int left = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){
                int temp = nums[i];//storing non-zero value in temp
                nums[i] = nums[left];//
                nums[left] = temp;
                left++;
                System.out.print(nums[left-1] + ",");
            }

        }
        for(int i = left; i < nums.length; i++){
            System.out.print(0 + ",");
        }
    }

    public static void main(String[] args) {
        int[] myArr = {0, 1, 0, 3, 12};
        moveZeroes(myArr);
    }
}
