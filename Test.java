// basic LinkedList

public class Test {
  public static class Node{
      int data;
      Node next;
      public Node(int data){
          this.data=data;
          this.next=null;
  }

   }
   public static int size;
   public static Node head;
  public static Node tail;
   public void addFirst(int data){
       Node newNode=new Node(data);
       if(head==null){
           head=tail=newNode;
       }
       size++;
       newNode.next=head;
       head=newNode;
   }
   public void addLast(int data){
       Node newNode=new Node(data);
       size++;
       tail.next=newNode;
       tail=newNode;
   }
   public void add(int data,int index){
       if(index==0){
           addFirst(data);
       }
       Node newNode=new Node(data);
       Node temp=head;
       int i=0;
       while(i<index-1){
           temp=temp.next;
           i++;
       }
       size++;
       newNode.next=temp.next;
       temp.next=newNode;
   }
   public void print(){
       if(head==null){
           System.out.print("null");
           return;
       }
       Node temp=head;
       while (temp!=null){

           System.out.print(temp.data+"->");
           temp=temp.next;
       }
       System.out.println("null");
   }
   public void removeFirst(){
       if(size==0){
           System.out.println("ll is empty");
           size=Integer.MIN_VALUE;
           return;
       } else if (size==1) {
           head=tail=null;
           size=0;
           return;
       }
       head=head.next;
       size--;
   }
   public void removeLast(){
       if(size==0){
           System.out.println("ll is empty");
           size=Integer.MIN_VALUE;
           return;
       } else if (size==1) {
           head=tail=null;
           size=0;
           return;
       }
       Node pre=head;
       for(int i=0;i<size-2;i++){
           pre=pre.next;
       }
       pre.next=null;
       tail=pre.next;
       size--;
   }
   public int ItrSearch(int key){
       Node temp =head;
       int i=0;
       while (temp!=null){
           if(temp.data==key){
               System.out.println(key+" is found at Node " +i);
               return i;
           }
           temp=temp.next;
           i++;

       }
       System.out.println(key+" is not found");
       return -1;
   }
   public void recSearch(int key, Node temp){
       if(temp.next==null){
           System.out.println(key +" is not found");
           return;
       }
       if(temp.data==key){
           System.out.println(key+ " is found in this node");
           return;
       }
       recSearch(key,temp.next);

   }

    public static void main(String[] args) {
       Test ll=new Test();
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(4);
       ll.addLast(5);
       ll.add(3,2);
       ll.print();
       ll.ItrSearch(7);
       Node currNode=head;
       ll.recSearch(8,currNode);


    }
        
    }
     

