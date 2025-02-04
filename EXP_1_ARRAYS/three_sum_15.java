//Problem number 15 Three Sum
package arrays_leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum_15 {
        public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int j,k,sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

            j=i+1; k=n-1;

            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));

                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(sum>0)
                k--;
                else
                j++;
            }
        }
        return ans;
    }
}
