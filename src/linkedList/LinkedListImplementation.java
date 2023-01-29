package linkedList;
import java.util.Scanner;
public class LinkedListImplementation {
	public static Node<Integer> takeInput() {
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1) {
			Node<Integer> currentNode=new Node<Integer>(data);
			if(head==null) {
				head=currentNode;
				tail=currentNode;
			}else {
				tail.next=currentNode;
				tail=tail.next;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		print(head);
		}
	}
