//Problem Number 1 Two Sum
package arrays_leet;

import java.util.HashMap;

public class two_sum_1 {
        public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap();
        //fill hm
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        //searching
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int rem=target-num;
            if(map.containsKey(rem)){
                int index=map.get(rem);
                if(index==i)continue;
                return new int[]{i,index};
            }
        }
        
        return new int[]{};
    }
}
