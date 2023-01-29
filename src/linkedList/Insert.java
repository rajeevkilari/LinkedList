package linkedList;

import java.util.Scanner;

public class Insert {
	static Node<Integer> head=null;
	static Node<Integer> tail=null;
public static void insert(int data) {
	Node<Integer> currentNode=new Node<Integer>(data);
	if(head==null) {
		head=currentNode;
		tail=currentNode;
	}else {
		tail.next=currentNode;
		tail=tail.next;
	}
} 
	public static Node<Integer> insertion(int pos, int element){
		Node<Integer> temp1=head;
		Node<Integer> temp2=head;
	    Node<Integer> current=new Node<Integer>(element);
	if(pos==0) {
		current.next=temp1;
		temp1=current;
		return temp1;
	}
	int i=0;
	while(temp1!=null) {
		if(pos == i+1) {
			current.next=temp1.next;
			temp1.next=current;
			temp1=temp1.next;
		}else {
			temp1=temp1.next;
		}
		i++;
	}
	return temp2;	
	}
	public static void main(String[] args) {
		Insert List=new Insert();
		List.insert(23);
		List.insert(265);
		List.insert(367);
		List.insert(45);
		List.insert(2);
       List.insert(17);
       Scanner s=new Scanner(System.in);
          int pos=s.nextInt();
         int element=s.nextInt();
  Node<Integer> finalOutput=List.insertion(pos,element);
       while(finalOutput!=null) {
    	   System.out.println(finalOutput.data);
    	   finalOutput=finalOutput.next;
       }
	}

}
