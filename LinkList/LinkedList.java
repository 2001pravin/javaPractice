package LinkList;

import LinkList.Linklist.Node;

public class LinkedList {
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
    public void addFirst(int data){
        // step1=create new node
        Node newNode= new Node(data);
        
      if(head==null){
           head= tail =newNode;
           return;
      }
    
      // step2=newNode next =head
      newNode.next=head;//link
      // step 3- head = newNode
      head=newNode;
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
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&  fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if (slow==fast) {
                return true;
                
            }
        }
        return false;
    }
    public static void removeCycle(){
        // detect cycle 
        Node slow = head;
        Node fast=head;
        boolean flag=false;
        while (fast!=null&& fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) {
                flag = true;
                break;
            }
        }
        if (flag==false) {
            return;
        }
        // find meeting point
        slow=head;
        Node prev= null;
        while (slow!=fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle
        prev.next= null;
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast!=null&& fast.next!=null) {
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp = mergedLL;
        while (head1!=null&&head2!=null) {
            if (head1.data<=head2.data) {
                temp.next=head1.next;
                head1 = head1.next;
                temp=temp.next;
            }else{
                temp.next= head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1!=null) {
            temp.next=head1;
            head1 = head1.next;
            temp=temp.next;
            
        }
        while (head2!=null) {
            temp.next=head1;
            head2 = head2.next;
            temp=temp.next;
            
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if (head==null || head.next== null) {
            return head;
        }
    //    find mid 
        Node mid = getMid(head);
        // left & right ms
        Node rightHead= mid.next;
        mid.next=null;
      Node newleft=  mergeSort(head);
      Node newRight=   mergeSort(rightHead);
    //   merge
    return merge(newleft,newRight);
    }
    public void zigzag(){
       Node slow =head;
       Node fast =head.next;
       while (fast!=null&&fast.next!=null) {
        slow= slow.next;
        fast = fast.next.next;
  }
     Node mid=slow;
    //  revers 2nd half
    Node curr = mid.next;
    mid.next= null;
    Node prev=null;
    Node next;
    while (curr!= null) {
        next = curr.next;
        curr.next=prev;
        prev=curr;
        curr= next;
        
    }
    Node left= head;
    Node right = prev;
    Node nextl ,nextR;
    while (left!=null&&right!=null) {
        nextl=left.next;
        left.next=right;
        nextR=right.next;
        right.next = nextl;
        left=nextl;
        right=nextR;
    }
    }
    public static void main(String[] args) {
        // head = new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        //   head.next.next.next=temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
       LinkedList ll = new LinkedList();
       ll.addFirst(0);
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addFirst(4);
       ll.addFirst(5);
       ll.print();
       ll.head= ll.mergeSort(ll.head);
       ll.print();
       ll.zigzag();
       ll.print();

    }
    
}
