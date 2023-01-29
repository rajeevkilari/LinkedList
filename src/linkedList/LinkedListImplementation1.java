package linkedList;
import java.util.Scanner;
public class LinkedListImplementation1 {
public static Node1<Integer> takeInput(boolean isHead, int headData){
	if(isHead) {
	System.out.println("enter head data");
	}else {
		System.out.println("enter " + headData + "'s next");
	}
	
		Scanner s =new Scanner(System.in);
		int data=s.nextInt();
		Node1<Integer> head=new Node1<Integer>(data);
		if(data==-1) {
			return null;
		}
	Node1<Integer> tail=takeInput(false, data);
	head.next=tail;
	return head;
	}
	public static void print(Node1<Integer> head) {
		if(head==null) {
			return;
		}
		System.out.println(head.data + " ");
		print(head.next);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node1<Integer> head=takeInput(true,0);
print(head);
	}

}
