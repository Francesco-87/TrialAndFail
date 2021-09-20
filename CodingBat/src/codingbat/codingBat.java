package codingbat;

public class codingBat {

    public static void main(String[] args) {
	// write your code here

        int[] nums = {1, 0, 1, 0, 0, 1, 1};


        print(evenOdd(nums));

    }
    public static int[] evenOdd(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i] %2 != 0){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
            if(i == nums.length-2 && count < nums.length-1){
                i = -1;
                count++;
            }


        }


        return nums;
    }

    public static void print(int [] nums){

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);

        }
    }

}
