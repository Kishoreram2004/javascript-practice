
public class ImplementingStackUsingArray {
    public static int[] stack;
    public static void createStack(int size){
        stack = new int[size];
    }
    public static int index = 0;
    public static void push(int n){
        stack[index++] = n;
        System.out.println("added");
    }
    public static void pop(){
        stack[index--] = 0;
        System.out.println("removed");
    }
    public static void display(){
        for(int i = 0 ; i< index; i++){
            System.out.print(stack[i]+" ");
        }
    }

    public static void main(String[] args){
        createStack(5);
        push(11);
        push(15);
        push(55); 
        display();   
        
    }
        
}
