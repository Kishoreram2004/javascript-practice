package Infosys;

public class Suffix {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] suff = new int[arr.length];
        suff[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2 ;i>=0; i--){
            suff[i] = arr[i]+ suff[i+1]; 
            System.out.println(suff[i]);
        }

    }
}
