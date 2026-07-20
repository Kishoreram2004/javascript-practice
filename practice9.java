class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


class practice9{
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1 ; i< arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        Node newNode = new Node(15);
        int n = 4;

        Node temp2 = head;

        while(temp2.data != 4){
            temp2 = temp2.next;
        }

        newNode.next = temp2.next;
        temp2.next = newNode;


        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }

        
    }
}