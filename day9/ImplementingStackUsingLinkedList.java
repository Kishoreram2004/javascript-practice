class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
        this.next = null;
    }
}

class Queue{
    Node front;
    Node rear;
    void enqueue(int data){
        Node node = new Node(data);
        if(front == null){
            front = node;
            rear = node;
            return;
        }
            rear.next = node;
            rear = node;
        
    } 
    int dequeue(){
        if(front == null){
            System.out.println("queue is empty");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return val;
    }
    public int peek(){
        if(front == null){
            return -1;
        }
        return front.data;
    }
    public void display(){
        Node temp  = front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

/**
 * ImplementingStackUsingLinkedList
 */
public class ImplementingStackUsingLinkedList {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(100);
        q.enqueue(50);
        q.display();
    }
    
}