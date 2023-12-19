
/*

6. Add two numbers represented by Linked List
        Given two numbers represented by two linked lists, write a function that returns a Sum list. The
        sum list is a linked list representation of addition of two input numbers.
        Example 1:
        Input:
        S1 = 3, S2 = 3
        ValueS1 = {2,3,4}
        ValueS2 = {3,4,5}
        Output: 5 7 9
        Explanation: After adding the 2 numbers the resultant number is 5 7 9.

*/




package Assignment;


class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}


class LinkedLists{

    Node addLast(Node head,int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{

            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = newNode;
        }
        return head;
    }

    void display(Node head){
        // Node temp = head;
        if(head!=null){

            System.out.println("Linked List-");

            while(head!=null){
                System.out.print(head.data+"-->");
                head = head.next;
            }

            System.out.println("null");
        }

        else{
            System.out.println("Linked List is Empty...!");
        }
    }

    int addTwoLinked(Node head1,Node head2){

        String str1 = "";
        while(head1!=null){
            str1 +=head1.data;
            head1 = head1.next;
        }

        String str2 = "";
        while(head2!=null){
            str2 += head2.data;
            head2 = head2.next;
        }

        if(str1.length()>str2.length()){
            String temp = str1;
            str1 = str2;
            str2 =temp;
        }

        str1 = new StringBuffer(str1).reverse().toString();
        str2 = new StringBuffer(str2).reverse().toString();

        String str = "";
        int carry = 0;
        for(int i=0;i<str1.length();i++){
            int sum = str1.charAt(i)-48+str2.charAt(i)-48+carry;

            str += sum %10;
            carry = sum/10;

          //  System.out.println(sum);
        }

        for(int i=str1.length();i<str2.length();i++){
            int sum = str2.charAt(i)-48+carry;

            str += sum %10;
            carry = sum/10;
        }

        str = new StringBuffer(str).reverse().toString();

        return Integer.parseInt(str);
    }


    public static void main(String[] args) {
        
        Node head1 = null;
        LinkedLists ll = new LinkedLists();

        head1 = ll.addLast(head1,1);
        head1 = ll.addLast(head1,2);
        head1 = ll.addLast(head1,4);


        ll.display(head1);

        Node head2 = null;
        head2 = ll.addLast(head2,4);
        head2 = ll.addLast(head2,5);
        head2 = ll.addLast(head2,6);

        ll.display(head2);

        System.out.println(ll.addTwoLinked(head1, head2));
        
    }
}

