package Infosys;
public class equlibrium {
    
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int[] suff = new int[arr.length];
        suff[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2 ;i>=0; i--){
            suff[i] = arr[i]+ suff[i+1]; 
            
        }
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        for(int i = 1 ;i<arr.length; i++){
            pref[i] = arr[i]+ pref[i-1]; 
            
        }
        for(int i = 0 ; i< arr.length; i++){
            if(pref[i]-arr[i] == suff[i]-arr[i]){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);

    }


}
