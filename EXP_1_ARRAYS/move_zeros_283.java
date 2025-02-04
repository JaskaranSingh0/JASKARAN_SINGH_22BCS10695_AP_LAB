////Problem number 283 Move Zeros
package arrays_leet;

public class move_zeros_283 {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
    }
}
