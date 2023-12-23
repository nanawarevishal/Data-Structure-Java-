package LinkedList_Implementation;

import java.io.*;

class Queue{
    int data;
    Queue next;
    Queue front = null;
    Queue rear = null;

    Queue(){

    }

    Queue(int data){
        this.data = data;
        this.next = null;
    }

    Queue Offer(int data){

        Queue newQueue = new Queue(data);

        if(front == null ){
            front = newQueue;
            rear = newQueue;

        }

        else{
            rear.next = newQueue;
            rear = newQueue;
        }
        return front;
    }

    int poll(){

        int data = front.data;
        if(front == rear){
            front = null;
            rear = null;
        }
        else{
            front = front.next;
        }
        return data;
    }

    int peek(){
        
        return front.data;
        
    }

    void display(){
        Queue temp = front;

        if(temp == null){
            System.out.println("\nQueue is Empty.....!");
            return;
        }

        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

class Client{

    public static void main(String[] args)throws IOException {

        int ch = -1;
        Queue queue = new Queue();
        
        do {
            System.out.println("\n*****************Queue Implementation Using Linked List******************");

            System.out.println("1.Enqueue");
            System.out.println("2.Deque");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.println("\n-------------------------------------------------------------------------------");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter the choice: ");
            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 1:
                    System.out.println("Enter the data: ");
                    int data = Integer.parseInt(br.readLine());

                    queue.Offer(data);
                    break;
                
                case 2:
                    if(queue.front == null){
                        System.out.println("\nQueue is Empty......!");
                    }

                    else{

                        int val = queue.poll();
                        System.out.println("\nDeleted Element: "+val);
                    }
                    break;
                
                case 3:

                    if(queue.front == null){
                        System.out.println("\nQueue is Empty......!");
                    }
                    else{
                        int peek = queue.peek();
                        System.out.println("\nPeek Element: "+peek);
                    }
                    break;
                
                case 4:

                    if(queue.front == null){
                        System.out.println("\nQueue is Empty......!");
                    }

                    else{
                        System.out.println("\nQueue Elements....!");
                        queue.display();
                    }

                    break;
            
                default:
                    System.out.println("\nInvalid Choice......!");
                    break;
            }
            
        } while (ch!=5);
        
    }
}