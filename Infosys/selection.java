class selection{
    public static void main(String[] args){
        
        int[] nums = {5,4,7,2,1};
        for(int i = 1; i< nums.length; i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j]; 
                j--;
            }
            nums[j+1] = key;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}