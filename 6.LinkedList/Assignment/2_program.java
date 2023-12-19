
/*

2.Find length of Loop
    Given a linked list of size N. The task is to complete the function countNodesinLoop() that
    checks whether a given Linked List contains a loop or not and if the loop is present then return
    the count of nodes in a loop or else return 0. C is the position of the node to which the last node
    is connected. If it is 0 then no loop.
    Example 1:
    Input:
    N = 10
    value[]={25,14,19,33,10,21,39,90,58,45}
    C = 4
    Output: 7
    Explanation: The loop is 45->33. So length of loop is 33->10->21->39->
    90->58->45 = 7. The number 33 is
    connected to the last node to form the
    loop because according to the input the
    4th node from the beginning(1 based
    index) will be connected to the last
    node for the loop.
    Example 2:
    Input:
    N = 2
    value[] = {1,0}
    C = 1
    Output: 2
    Explanation: The length of the loop
    is 2.
    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(1)
    Constraints:
    1 <= N <= 500
    0 <= C <= N-1
 */




package Assignment;

class Node{

    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}

class LinkedList{

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

    int countNodesLoop(Node head,int c){
        int count =0;
        Node temp = head;

        while(temp!=null){
            ++count;
            temp = temp.next;
        }


        return count-c+1;
    }

    public static void main(String[] args) {
        
        Node head = null;
        LinkedList ll = new LinkedList();

        head = ll.addLast(head,10);
        head = ll.addLast(head,20);
        // head = ll.addLast(head,30);
        // head = ll.addLast(head,40);
        // head = ll.addLast(head,50);
        // head = ll.addLast(head,60);
        // head = ll.addLast(head,70);

        // ll.display(head);

        System.out.println(ll.countNodesLoop(head, 1));
        
    }


}