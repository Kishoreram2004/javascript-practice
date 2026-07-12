class BinarySearch{

    public static boolean rec(int l, int r, int[] arr,int target, int mid){
        if(l>r) return false;
        if(target == arr[mid]) {
            return true;
        }
        if(arr[mid]>target){
            return rec(l, mid-1, arr, target, (l+ (mid-1))/2);
            
        } 
        else{
            return  rec(mid+1, r, arr, target, (r+(mid+1))/2);
            
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,99};
        boolean found = rec(0, arr.length-1, arr, 100, (arr.length-1)/2);
        System.out.println(found);
    }
}