package Assignment;

class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class InsertIntoMiddle{

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

    int nodeCount(Node head){
        int count = 0;

        while(head!=null){
            count++;
            head = head.next;
        }

        return count;
    }

    Node insertNodeInMiddle(Node head,int data){
        Node curr = head;

        int nodecnt = nodeCount(head);
        int pos = nodecnt/2+1;

        int count = 0;
        while(curr!=null){

            if(count+1 == pos){
                Node newNode = new Node(data);
                Node temp  = curr.next;
                curr.next = newNode;
                newNode.next = temp;
                break;
            }

            count++;
            curr = curr.next;
        }

        return head;
    }


   
    public static void main(String[] args) {
        
        Node head = null;
        InsertIntoMiddle ll = new InsertIntoMiddle();

        head = ll.addLast(head,1);
        head = ll.addLast(head,2);
        head = ll.addLast(head,3);
        // head = ll.addLast(head,5);
        // head = ll.addLast(head,6);

        ll.display(head);

        head = ll.insertNodeInMiddle(head, 4);

        ll.display(head);


    }
}

