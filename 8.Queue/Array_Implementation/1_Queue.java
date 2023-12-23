package Array_Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class queue{
    int maxSize;
    int front;
    int rear;
    
    int queue[];

    queue(int size){
        this.maxSize = size;
        this.queue = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    void offer(int data){
        if(rear == maxSize-1){
            System.out.println("Queue is Full.....!");
            return;
        }
        
        if(front == -1){
            front++;
        }

        rear++;
        queue[rear] = data;
    }

    int poll(){

        int data = queue[front];
        front++;

        if(front == maxSize || front-1 == rear){
            front = -1;
            rear = -1;
        }
        return data;
    }

    int peek(){
        return queue[front];
    }

    void display(){
        System.out.print("| ");
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }

        System.out.println(" |");
    }

    boolean isFull(){
        if(rear == maxSize -1){
            return true;
        }

        return false;
    }

    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }

}

class Client{

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the queue: ");
        int size = Integer.parseInt(br.readLine());

        queue q = new queue(size);
        int ch = -1;
        do {
            System.out.println("\n***********Queue Implementation*******************");

            System.out.println("1.Offer");
            System.out.println("2.Poll");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.println("\n--------------------------------------------------------");

            System.out.println("Enter the choice");
            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 1:
                    if(q.isFull()){
                        System.out.println("Queue is full......!\n");
                    }
                    else{

                        System.out.println("Enter the data: ");
                        int data = Integer.parseInt(br.readLine());
                        q.offer(data);
                    }
                    break;
                
                case 2:

                    if(q.isEmpty() || q.front > q.rear){
                        System.out.println("\nQueue is Empty.....!\n");
                    }
                    else{
                        System.out.println("\nQueue Poped Element: "+q.poll());
                    }
                    break;
                
                case 3:

                    if(q.isEmpty()){
                        System.out.println("\nQueue is Empty....\n");
                    }

                    else{
                        System.out.println("\nQueue Element: "+q.peek());
                    }
                    break;
                
                case 4:
                    q.display();
                    break;
                
                default:
                    System.out.println("\nInvalid Choice....!\n");
                    break;
            }

        } while (ch!=5);
    }
}