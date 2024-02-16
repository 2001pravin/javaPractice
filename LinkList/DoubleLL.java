package LinkList;

public class DoubleLL { 
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    } 
     public static Node head;
     public static Node tail;
     public static int size;
    //  add
    // add first
    public void AddFirst(int data){
         Node newNode= new Node(data);
         size++;
         if (head==null){
            head= tail=newNode;
            return;
         }
         newNode.next=head;
         head.prev=newNode;
         head = newNode;
    }
    // add last


    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"<-->");
            temp =temp.next;  
        }
        System.out.println("null");
    }
     public static void main(String[] args) {
        DoubleLL dl=new DoubleLL();
        dl.AddFirst(5);
        dl.AddFirst(6);
        dl.AddFirst(8);
        dl.AddFirst(9);
        dl.AddFirst(10);
        dl.print();
     }

}
