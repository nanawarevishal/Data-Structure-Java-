

package ArrayImplementation.StaticArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class stack{

    int maxSize;
    int top = -1;
    int stackArr[];

    stack(int size){
        this.stackArr = new int[size];
        this.maxSize = size;
    }

    void push(int data){

        if(isFull()){
            System.out.println("Stack Overflow...!");
        }

        else{
            top++;
            stackArr[top] = data;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow.....!");
        }
        
        else{
            return stackArr[top--];
        }
        return -1;
    }

    int peek(){
        if(isEmpty()){
            return -1;
        }
        return stackArr[top];
    }

    boolean isFull(){
        if(top+1 == stackArr.length){
            return  true;
        }
        return false;
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }

        return false;
    }

    int size(){
        int count =0;
        for(int i= top;i>=0;i--){
            count++;
        }

        return count;
    }

    void display(){

        for(int i=top;i>=0;i--){

            if(i==top){
                System.out.println("| "+stackArr[i]+" |"+" <---Top");
            }
            else{
                System.out.println("| "+stackArr[i]+" |");
            }
            
        }
        System.out.println("______");
    }
}

class Client{

    public static void main(String[] args)throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of StacK: ");
        int size = Integer.parseInt(br.readLine());

        stack obj = new stack(size);
        int ch =-1;

        do {

            System.out.println("\n***********Stack Implementation****************\n");

            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.isEmpty");
            System.out.println("5.Size");
            System.out.println("6.Display");
            System.out.println("7.Exit");

            System.out.println("\n----------------------------------------------------\n");

            System.out.println("Enter the cloice: ");
            ch = Integer.parseInt(br.readLine());

            System.out.println();

            switch (ch) {
                case 1:
                    System.out.println("Enter the data: ");
                    int data = Integer.parseInt(br.readLine());
                    obj.push(data);
                    break;
                
                case 2:
                    if(obj.pop()==-1){
                        
                    }
                    else{

                        System.out.println("Deleted Element: "+obj.pop());
                    }
                    break;
                
                case 3:
                    if(obj.peek()== -1){
                        System.out.println("Stack is Empty...!");
                    }
                    else{
                        System.out.println("Peek Element: "+obj.peek());
                    }
                    break;
                
                case 4:
                    System.out.println(obj.isEmpty());
                    break;
                
                case 5:
                    System.out.println("Size of stack: "+obj.size());
                    break;
                
                case 6:
                System.out.println("Stack: ");
                    obj.display();
            
                default:
                    break;
            }
            
        } while (ch!=7);

        
    }
}