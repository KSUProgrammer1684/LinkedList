import java.util.*;
class LinkedLists{
private Node first;
   class Node{
   public int num;
   public Node next;
   } 
   public LinkedLists(){
   first = null;
   }
   public void addNode(int n){
   Node newNode = new Node();
   newNode.num = n;
   newNode.next = first;
   first = newNode;
   }
   public void addBack(int n){
   Node temp = new Node();
   temp.num=n;
   Node current = first;
   while(current.next!=null){
   current = current.next;
   current.next = temp;
   }
   }
   public int display(){
   Node current = first;
   int data = 0 ;
   while(current.next!=null){
   data += current.num;
   current = current.next;
   }
   data += current.num;
   return data;
   }
public static void main(String[] args){
     
      LinkedLists l = new LinkedLists();
      System.out.println("Enter length on line one, and then enter elements on the next lines.");
      int length; 
      int element; 
      Scanner input = new Scanner(System.in);
      length = input.nextInt();
      int sum = 0; 
      for(int i = 0; i < 10; i++){
         element = input.nextInt();
         l.addNode(element); 
      }
     System.out.println(l.display()); 
   }
   }



 