package Assignment;



class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class IntersectionYShaped{

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

    int intersectionLinkedList(Node head1,Node head2){

        Node temp = head2;
        while(head1!=null){
            head2 = temp;
            while(head2!=null){

                if(head1.data == head2.data){
                    return head1.data;
                }

                head2 = head2.next;
            }

            head1 = head1.next;
        }

        return -1;
    }

    public static void main(String[] args) {
        
        Node head1 = null;
        IntersectionYShaped ll = new IntersectionYShaped();

        head1 = ll.addLast(head1,10);
        head1 = ll.addLast(head1,20);
        head1 = ll.addLast(head1,30);
        head1= ll.addLast(head1,40);
        head1= ll.addLast(head1,50);

        Node head2 = null;
        head2 = ll.addLast(head2, 90);
        head2 = ll.addLast(head2,30);
        head2 = ll.addLast(head2,40);
        head2 = ll.addLast(head2,50);

        System.out.println(ll.intersectionLinkedList(head1, head2));
    }
}