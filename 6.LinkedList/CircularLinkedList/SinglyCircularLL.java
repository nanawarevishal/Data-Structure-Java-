package CircularLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class SinglyCircularls{

    Node head = null;

    Node addFirst(Node head,int data){
        
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = head;
        }

        else{

            newNode.next = head;
            Node temp = head;
            
            while(temp.next !=head){
                temp = temp.next;
            }

            head = newNode;
            temp.next = head;

        }

        return head;
    }

    Node addLast(Node head,int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            newNode.next = head;
        }

        else{

            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }

        return head;
    }

    Node deleteFirst(Node head){
        if(head==null){
            System.out.println("Linked list is empty...!");
        }

        if(countNode(head)==1){
            head = null;
            return head;
        }

        else{

            Node temp = head;

            while(temp.next!=head){
                temp = temp.next;
            }

            head = head.next;
            temp.next = head;

        }
        return head;
    }

    Node deleteLast(Node head){
        if(head == null){
            System.out.println("Linked list is empty...!");
        }

         if(countNode(head)==1){
            head = null;
            return head;
        }

        else{

            Node temp = head;

            while(temp.next.next!=head){
                temp = temp.next;
            }

            temp.next = head;

        }
        return head;
    }

    void display(Node head){

        if(head==null){
            System.out.println("Linked List is Empty....!");
            return;
        }


        Node temp = head;
        do {

            System.out.print(temp.data+"-->");
            temp = temp.next;
        
        } while (temp!=head);

        System.out.println("null");
        
    }

    int countNode(Node head){

        if(head==null){
            return 0;
        }

        int count = 1;
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
            count++;
        }
        return count;
    }

    Node insertAtPosition(Node head,int data,int pos){
        
        Node newNode = new Node(data);
        if(pos==1){

            if(head==null){
                head = newNode;
                newNode.next = head;
            }
            else{

                Node temp = head;
                while(temp.next!=head){
                    temp = temp.next;
                }
                newNode.next = head;
                head = newNode;
                temp.next = newNode;
            }

            return head;
        }

        Node temp = head;
        int count = 1;

        boolean flag = false;

        while(temp.next!=head){

            if(count+1 == pos){
                newNode.next = temp.next;
                temp.next = newNode;
                flag = true;
                break;
            }

            count++;
            temp = temp.next;
        }

        if(!flag){

            temp.next = newNode;
            newNode.next = head;
        }
        return head;
    }

    Node deleteAtPosition(Node head,int pos){

        if(head == null){
            System.out.println("Linked List is Empty...!");

        }

        if(countNode(head)==1){
            return null;
        }

        if(pos==1){
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }

            head = head.next;
            temp.next = head;
        }

        else{

            int count =1;
            Node temp = head;
            boolean flag = false;
            while(temp.next.next !=head){

                if(count+1 == pos){
                    temp.next = temp.next.next;
                    flag = true;
                    break;
                }
                count++;
                temp = temp.next;
            }

            if(!flag){
                temp.next = head;
            }
        }
        return head;
    }

    Node reverseLs(Node head){

        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            Node temp1 = temp.next;
            temp.next = prev;
            prev = temp;
            temp = temp1;
        }
        temp.next = prev;
        head = temp;

        // Node t = head;
        // while(t.next!=null){
        //     t = t.next;
        // }
        // t.next = head;

        return head;
    }
}

class Client{

    public static void main(String[] args) throws IOException {

        SinglyCircularls ll = new SinglyCircularls();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        
        do {

            System.out.println("\n********************Singly Linked List****************");

            System.out.println("1.Add First");
            System.out.println("2.Add Last");
            System.out.println("3.Delete First");
            System.out.println("4.Delete last");
            System.out.println("5.Display");
            System.out.println("6.Count Node");
            System.out.println("7.Insert At Position");
            System.out.println("8.Delete At Position");
            System.out.println("9.Reverse Linked List");
            System.out.println("10.Exit");

            System.out.println("\n--------------------------------------------------");
            
            System.out.println("Enter the choice: ");
            x = Integer.parseInt(br.readLine());
            
            switch (x) {

                case 1:
                    System.out.println("Enter the data: ");
                    int data = Integer.parseInt(br.readLine());
                    ll.head = ll.addFirst(ll.head,data);    
                    break;

                case 2:
                    System.out.println("Enter the data: ");
                    data = Integer.parseInt(br.readLine());
                    ll.head = ll.addLast(ll.head,data);   
                    break;

                case 3:
                    ll.head = ll.deleteFirst(ll.head);
                    System.out.println("Node deleted Suucessfully...!");
                    break;
                
                case 4:
                    ll.head = ll.deleteLast(ll.head);
                    System.out.println("Node deleted Suucessfully...!");

                    break;

                case 5:
                    ll.display(ll.head);
                    break;
                
                case 6:
                    int count = ll.countNode(ll.head);
                    System.out.println("Node Count: "+count);
                    break;
                
                case 7:
                    System.out.println("Enter the position: ");
                    int pos = Integer.parseInt(br.readLine());

                  //  System.out.println(ll.countNode(ll.head));

                    if(ll.countNode(ll.head)+1 < pos || pos <= 0){
                        System.out.println("Invalid Position....!");
                    }
                    else{

                        System.out.println("Enter the data: ");
                        data = Integer.parseInt(br.readLine());
                        ll.head = ll.insertAtPosition(ll.head, data, pos);
                        System.out.println("Inserted..");
                    }
                    break;
                
                case 8:
                    System.out.println("Enter the position: ");
                    pos = Integer.parseInt(br.readLine());

                  //  System.out.println(ll.countNode(ll.head));

                    if(ll.countNode(ll.head) < pos || pos <= 0){
                        System.out.println("Invalid Position....!");
                    }
                    else{
                        ll.head = ll.deleteAtPosition(ll.head,pos);
                        System.out.println("Deleted..");
                    }
                    break;
                
                case 9:
                    ll.head = ll.reverseLs(ll.head);
                    break;

                default:
                    break;
            }
        } while (x!=10);
    }
}