package ProblemStatement;

import java.util.Scanner;

class TwoStack{
    int top1= -1;
    int maxSize;
    int top2 = maxSize;
    int stackArr[];

    TwoStack(int size){
        this.stackArr = new int[size];
        this.maxSize = size;
    }

    void push1(int data){
        if(top2-top1<=1){
            System.out.println("Stack Overflow....!");
            return;
        }

        top1++;
        stackArr[top1] = data;

    }

    void push2(int data){
        if(top2-top1<=1){
            System.out.println("Stack Overflow....!");
            return;
        }

        top2--;
        stackArr[top1] = data;

    }

    int pop1(){
        if(top1 == -1){
            System.out.println("Stack Underflow....!");
            return -1;
        }

        return stackArr[top1--];
    }

    int pop2(){
        if(top2 == maxSize){
            System.out.println("Stack Underflow....!");
            return -1;
        }

        return stackArr[top2++];
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        TwoStack st = new TwoStack(size);

    }
}
