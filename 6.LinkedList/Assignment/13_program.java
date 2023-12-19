package Assignment;


class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class NthNodeFromEnd{

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

    int NtheNodeFromEnd(Node head,int n){
        int count = 0;

        Node curr = head;

        while(curr!=null){
            count++;
            curr = curr.next;
        }

        int cnt = 0;

        if(n>count){
            return -1;
        }

        curr =head;
        while(curr!=null){

            if(cnt == count-n){
                return curr.data;
            }
            cnt++;
            curr = curr.next;
        }
        return -1;
    }

   
    public static void main(String[] args) {
        
        Node head = null;
        NthNodeFromEnd ll = new NthNodeFromEnd();

        head = ll.addLast(head,10);
        head = ll.addLast(head,12);
        head = ll.addLast(head,11);
        head = ll.addLast(head,22);
        head = ll.addLast(head,1);
        head = ll.addLast(head,13);
        head = ll.addLast(head,40);
        head = ll.addLast(head,25);

        ll.display(head); 

        System.out.println(ll.NtheNodeFromEnd(head, 9));

    }
}
