
package Infosys;

import java.util.HashMap;

public class MaximumSizeSubarraySumEqualsk {
    public static void main(String[] args){
        int[] arr= {1, -1, 5, -2, 3};
        int k = 3;

        HashMap<Integer, Integer>  hs= new HashMap<>();
        hs.put(0, -1);
        int sum = 0 ; 
        int cnt = 0;
        for(int i = 0 ; i < arr.length; i++){
            sum+=arr[i];
            if(hs.containsKey(sum-k)){
                cnt = Math.max(cnt, i - hs.get(sum-k));
            }
            
            if(!hs.containsKey(sum)){
                hs.put(sum , i);
            }
        }
        System.out.println(cnt);
    }
}
