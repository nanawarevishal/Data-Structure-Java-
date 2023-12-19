package Assignment;

import java.util.HashSet;


class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class RemoveDuplicates{

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

    Node removeDuplicated(Node head){

        if(head == null){
            return head;
        }
        
        HashSet<Integer>hs = new HashSet<>();

        Node curr = head;
        Node prev = null;
        while(curr!=null){
            if(hs.contains(curr.data)){
                if(curr.next!=null){
                    prev.next = curr.next;
                    prev = prev;
                }
                else{
                    prev.next = null;
                    break;
                }
            }
            else{
                hs.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }


    public static void main(String[] args) {
        
        Node head = null;
        RemoveDuplicates ll = new RemoveDuplicates();

        head = ll.addLast(head,1);
        // head = ll.addLast(head,2);
        head = ll.addLast(head,1);
        head = ll.addLast(head,1);
        head = ll.addLast(head,1);
        head = ll.addLast(head,1);
        // head = ll.addLast(head,4);
        // head = ll.addLast(head,3);

        ll.display(head); 
        
        head = ll.removeDuplicated(head);

        ll.display(head);

    }
}