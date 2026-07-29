package Infosys;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] nums = {2,1,5,1,3,2};
        int k = 3;
        int i = 0 ;
        int j = 0;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        while (j<nums.length) {
            sum += nums[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1 == k){
                
                maxi = Math.max(maxi, sum);
                sum-=nums[i];
                j++;
                i++;
            }

        }
        System.out.println(maxi);

    }
}
