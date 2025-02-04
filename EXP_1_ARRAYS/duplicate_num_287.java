//Problem Number 287 Find the Duplicate Number
package arrays_leet;

import java.util.Arrays;

public class duplicate_num_287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return n;
    }
}
