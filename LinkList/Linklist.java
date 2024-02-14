package LinkList;

import java.nio.channels.NoConnectionPendingException;

import ArrayList.sort;

public class Linklist {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    
        
    } 
    public static Node head;
    public static Node tail;
    public static int size;
    // methods 
    public void addFirst(int data){
          // step1=create new node
          Node newNode= new Node(data);
          size++;
        if(head==null){
             head= tail =newNode;
             return;
        }
      
        // step2=newNode next =head
        newNode.next=head;//link
        // step 3- head = newNode
        head=newNode;
    }
    public  void addLast(int data) {
        Node newNode= new Node(data);
        size++;

        if (head==null) {
            head= tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    public void print(){
        if (head==null) {
            System.out.println("ll is empty");
            return;
            
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data){
        if (idx==0) {
            addFirst(data);
            return;
            
        }
          Node newNode= new Node(data);
          size++;
          Node temp= head;
          int i=0;
          while (i<idx-1) {
            temp= temp.next;
            i++;
            
          }
        //   i=idx-1; temp->prev
          newNode.next=temp.next;
          temp.next=newNode;
    }

    public int removeFirst(){
      if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
      }else if (size==1) {
        int value= head.data;
        head= tail=null;
        size--; 
        return value;
      }
        int value=head.data;
        head= head.next;
        size--;
        return value;
        
    }
    public int removeLast(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val= head.data;
            head=tail=null;
            size--;
            return val;
            
        }
             Node prev=head;
             for (int i = 0; i < size-2; i++) {
                prev=prev.next;
                
             }
             int val= prev.next.data;
             prev.next=null;
             tail=prev;
             size--;
             return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while (temp != null) {
            if(temp.data==key){
                return i;
            }
            temp= temp.next;
            i++;
            
        }
        return -1;
    }
     public int helper(Node head, int key){
        if (head==null) {
            return-1;
            
        }
        if (head.data== key) {
            return 0;
            
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
            
        }
        return idx+1;
     }
     public int recSearch(int key){
        return helper(head, key);
     }
     public void reverse(){//O(n)
        Node prev = null;
        Node curr = tail =head;
        Node next;
        while (curr!=null) {
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr= next;
            
        }
        head = prev;
     }
     public void DeletefromEnd(int n){
        int sz=0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            sz++;
            
        }
        if (n==sz) {
             head=head.next;//removeFirst
            return;
            
        }
        // sz-n 
        int i=1;
        int iToFind=sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
     }
     public Node mid(Node head){
        Node slow = head;
        Node fast = head;
        if (fast!=null||fast.next!=null) {
           slow= slow.next;
            fast= fast.next.next;
            
            
        }
        return slow;

     }
     public boolean chakePaldroum(){
      if(head==null||head.next==null){
        return true;
      }
    //   step1 - find mid
        Node miNode = mid(head);
        // step2 - reverse 2nd half
        Node prev= null;
        Node curr= miNode;
        Node next;
         while (curr!=null) {
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr=next;
            
         }
         Node right = prev;
         Node left = head;
        //  step 3 check left half & right half
        while (right!= null) {
            if (left.data!=right.data) {
                return false;
            }
            left = left.next;
            right=right.next;
            
        }
        return true;
     }

    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        // ll.addLast(1);
       System.out.println(ll.chakePaldroum()); 
        // ll.print();
        // ll.addFirst(0);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(44);
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addLast(25);
        // ll.add(2, 100);
        // ll.print();
        System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.reverse();
        // ll.DeletefromEnd(2);
        ll.print();
        
       
        // System.out.println(ll.recSearch(1));
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(1));
        // System.out.println(ll.itrSearch(1000));


    }
    
}
