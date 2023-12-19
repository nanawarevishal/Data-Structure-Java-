package DoublyLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
    int data;
    Node prev = null;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class DoublyLinkedls{

    Node head = null;

    Node addFirst(Node head,int data){

        if(head == null){
            Node newNode = new Node(data);
            head = newNode;
        }

        else{

            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            
        }

        return head;
    }

    Node addLast(Node head,int data){
        if(head == null){
            Node newNode = new Node(data);
            head = newNode;
        }

        else{

            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }

            Node newNode = new Node(data);
            temp.next = newNode;
            newNode.prev = temp;

        }

        return head;
    }

    Node deleteFirst(Node head){

        if(head == null){
            System.out.println("Linked List is Empty...!");
        }

        else{

            Node temp = head;
            temp = temp.next;
            temp.prev = null;
            head = temp;
        }

        return head;
    }

    Node deleteLast(Node head){

        if(head == null){
            System.out.println("Linked List is Empty...!");
        }

        else{

            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            Node prevNode = temp.prev;
            prevNode.next = null;
        }

        return head;
    }

    void display(Node head){
        
        while(head!=null){
            System.out.print(head.data+"-->");
            head = head.next;
        }
        System.out.println("null");
    }

    int countNode(Node head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    Node insertAtPosition(Node head,int data,int pos){

        Node newNode = new Node(data);
        int count = 1;
        
        if(pos==1){ 
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        

        else{

            Node temp = head;
            boolean flag = false;

            while(temp.next!=null){

                if(count==pos){
                    newNode.next = temp;
                    newNode.prev = temp.prev;
                    temp.prev.next = newNode;
                    temp.prev = newNode;
                    flag = true;
                    break; 
                }
                count++;
                temp = temp.next;
            }

            if(!flag){
                temp.next = newNode;
                newNode.prev = temp;
            }
        }

        return head;
    }

    Node deleteAtPosition(Node head,int pos){
        if(pos==1){
            head = head.next;
            head.prev = null;
        }

        else{

            int count = 1;
            boolean flag = false;
            Node temp = head;

            while(temp.next!=null){

                if(count == pos){
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                    flag = true;
                    break;
                }

                count++;
                
                temp = temp.next;
            }

            if(!flag){
                temp.prev.next = null;
            }

        }

        return head;
    }
}

class Client{

    public static void main(String[] args)throws IOException {
        
        DoublyLinkedls ll = new DoublyLinkedls();

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
            System.out.println("9.Exit");

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
                    

                default:
                    break;
            }
        } while (x!=9);

    }
}
