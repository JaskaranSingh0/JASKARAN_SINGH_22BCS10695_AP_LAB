//Problem number 26 Remove Duplicates from Sorted Array
package arrays_leet;

public class duplicate_26 {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for (int i =1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
