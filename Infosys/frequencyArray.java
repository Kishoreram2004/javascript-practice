package Infosys;

public class frequencyArray {
    public static void main(String[] args) {
        int[] arr = new int[26];
        String s = "banana";
        for(char c: s.toCharArray()){
            arr[c - 'a']++;
        }
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]>0){
                System.out.println((char)(i+'a') +" "+ arr[i]);
            }
        }
    }
}
