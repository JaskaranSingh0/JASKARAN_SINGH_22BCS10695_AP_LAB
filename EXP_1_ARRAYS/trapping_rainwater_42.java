//Problem Number 42 Trapping Rain Water
package arrays_leet;

public class trapping_rainwater_42 {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        int left=0;
        int right=n-1;
        int left_M=0;;
        int right_M=0;
        int trap=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=left_M){
                    left_M=height[left];
                }
                else{
                    trap+=left_M-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=right_M){
                    right_M=height[right];
                }
                else{
                    trap+=right_M-height[right];
                }
                right--;
            }
        }
        return trap;
    }
}
