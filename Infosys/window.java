
import Infosys.prefixSum;
import java.util.HashMap;

class window{
    public static void main(String[] args){
        int[] nums = {2, 7, 6, 1, 4, 5};
        int k = 3;
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        int maxi = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,-1);
        for(int i = 0 ;i< nums.length; i++){
            if(hs.containsKey(pre[i]%k)){
                maxi = Math.max(i - hs.get(pre[i]%k), maxi);
            }
            if(!hs.containsKey(pre[i]%k)){
                hs.put(pre[i]%k , i);
            }
        } 
        System.out.println(maxi);
    }
}