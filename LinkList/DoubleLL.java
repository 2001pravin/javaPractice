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
    public void Addlast(int data){
      Node newNode= new Node(data);
      size++;
      if (head==null){
        head= tail=newNode;
        return;
     }
      newNode.prev=tail;
      tail.next=newNode;
      tail=newNode;
      

    }
    public int removeFirst(){
        if (head==null){
            System.out.println("dl is empty");
            return Integer.MAX_VALUE;
         }
         if (size==1) {
            int val=head.data;
            head= tail= null;
            size--;
            return val;

         }
         int val=head.data;
         head=head.next;
         head.prev=null;
         size--;
         return val;
    }
    
    public int removeLast(){
        if (head==null){
            System.out.println("dl is empty");
            return Integer.MAX_VALUE;
         }
         if (size==1) {
            int val=head.data;
            head= tail= null;
            size--;
            return val;
         }
        int val= tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }


    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"<-->");
            temp =temp.next;  
        }
        System.out.println("null");
    }
    public  void revers() {
        Node curr =head;
        Node prev=null;
        Node next;

        while(curr!=null){
          next= curr.next;
          curr.next= prev;
          curr.prev=next;
          prev=curr;
          curr=next;
        }
        head=prev;

    }
     public static void main(String[] args) {
        DoubleLL dl=new DoubleLL();
        dl.AddFirst(5);
        dl.AddFirst(6);
        dl.AddFirst(8);
        dl.AddFirst(9);
        dl.AddFirst(10);
        dl.Addlast(12);
       System.out.println(dl.size); 
       dl.print();
        dl.removeFirst();
        dl.removeLast();
        System.out.println(dl.size); 
        dl.print();
        dl.revers();
        dl.print();
     }

}
