import java.util.Arrays;

public int check(int[][] nums){
    int[] start = new int[nums.length];
    int[] end = new int[nums.length];
    for(int  i = 0; i< nums.length; i++){
        start[i] = nums[i][0];
        end[i] = nums[i][1];
    }

    Arrays.sort(start);
    Arrays.sort(end);
    int i = 0; 
    int j = 0;
    int cnt = 0;
    int maxi = 0;
    while(i<start.length && j < end.length){
        if(start[i]< end[j]){
            cnt++;
            i++;
            maxi = Math.max(cnt, maxi);
        }else{
            cnt--;
            j--;
        }
    }
    return maxi;
}