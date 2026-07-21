package Infosys;

public class prefixSum {
    
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int [] pref = new int[arr.length];
        pref[0] = arr[0];
        for(int i = 1; i< arr.length; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        //find the sum from 1 to 3 index

        int l = 1; // index
        int r = 3;

        int sum =0;
        if(l==0){
            sum = pref[arr.length-1];
        }else{
            sum = pref[r] - pref[l-1];
        }
        System.out.println(sum);

    }
}


// time complexity -> O(N)

// space complexity -> O(N)