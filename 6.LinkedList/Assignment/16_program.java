package Assignment;


class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class Rotate{

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

    int CountNodes(Node head){
        int count=0;

        while(head!=null){
            ++count;
            head = head.next;
        }

        return count;
    }

    Node rotateLinkedList(Node head,int k){
        k = k % CountNodes(head);

        for(int i=1;i<=k;i++){

            Node temp = head;
            head = head.next;
            Node curr = head;
    
            while(curr.next!=null){
                curr = curr.next;
            }
    
            curr.next = temp;
            temp.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        
        Node head = null;
        Rotate ll = new Rotate();

        head = ll.addLast(head,10);
        head = ll.addLast(head,20);
        head = ll.addLast(head,30);
        head = ll.addLast(head,40);
        head = ll.addLast(head,50);
        head = ll.addLast(head,60);
        head = ll.addLast(head,70);

        ll.display(head);

        int k = 3;

        head = ll.rotateLinkedList(head,k);

        ll.display(head);
    }
}