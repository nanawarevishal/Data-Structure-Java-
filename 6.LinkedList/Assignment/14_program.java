package Assignment;


class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class SortLinkedList{

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

    Node sortLinkedList(Node head){
        int count0 = 0;
        int count1 =0;
        int count2=0;

        Node curr = head;

        while(curr!=null){
            if(curr.data == 0){
                count0++;
            }
            else if(curr.data == 1){
                count1++;
            }
            else{
                count2++;
            }

            curr = curr.next;
        }

        curr = head;
        int i = 0;
        while(i<count0){
            curr.data = 0;
            i++;
            curr = curr.next;
        }

        int j = 0;

        while(j<count1){
            j++;
            curr.data = 1;
            curr = curr.next;
        }

        int k = 0;
        while(k<count2){
            k++;
            curr.data = 2;
            curr = curr.next;
        }

        return head;
    }

   


    public static void main(String[] args) {
        
        Node head = null;
        SortLinkedList ll = new SortLinkedList();

        head = ll.addLast(head,1);
        head = ll.addLast(head,2);
        head = ll.addLast(head,0);
        head = ll.addLast(head,2);
        head = ll.addLast(head,0);
        head = ll.addLast(head,1);
        head = ll.addLast(head,0);
        head = ll.addLast(head,2);

        ll.display(head); 

        head = ll.sortLinkedList(head);

        ll.display(head);


    }
}
