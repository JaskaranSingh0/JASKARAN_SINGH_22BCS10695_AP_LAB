//Problem number 55 Jump Game
package arrays_leet;

public class jump_game_55 {
    public boolean canJump(int[] nums) {
        int maxR=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxR)
            return false;
            maxR=Math.max(maxR,i+nums[i]);
        }
        return true;
    }
}
