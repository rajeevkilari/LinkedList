package linkedList;
import java.util.Scanner;
public class Search {
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
public void display() {
	Node<Integer> temp =head;
	if(head==null) {
		System.out.println("no elements");
		return;
	}
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}

public static boolean search(Node<Integer> head, int element) {
	Node<Integer> current=head;
	while(current!=null) {
		if(current.data==element) {
			return true;
		}
			current=current.next;
		}
	return false;
}
	public static void main(String[] args) {
		Search List=new Search();
		List.insert(23);
		List.insert(265);
		List.insert(367);
        List.display();
        Scanner s=new Scanner(System.in);
        int element= s.nextInt();
        boolean isPresent = List.search(head, element);
		System.out.println(isPresent);
		}
}
