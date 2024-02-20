package Stack;

import java.util.ArrayList;

public class stackImp {
    static class Node{
       int data ;
       Node next;
       Node(int data){
         this.data=data;
         this.next=null;
       }
    }
    static class Stack{
          static Node head =null;
        // static ArrayList<Integer> list= new ArrayList<>();
        // // is empty
         public static boolean isEmpty(){
        //     return list.size()==0;
        return head==null;
         }
        // // push
        public static void push(int data){
        //     list.add(data);
           Node newNode=new Node(data);
           if (isEmpty()) {
            head=newNode;
            return; 
            
           }
           newNode.next=head;
           head=newNode;
        }
        // // pop
         public static int pop(){
            if (isEmpty()) {
                return -1;
            }
               int val= head.data;
        //     int val =list.get(list.size()-1);
        //     list.remove(list.size()-1);
             head=head.next;
             return val;
         }
        public static int peek(){
            return head.data;
        //     return list.get(list.size()-1);
        // using linkedList

         }
    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }
    
}
