package linkedList;
import java.util.Scanner;
public class Delete {
	static Node<Integer> head=null;
	static Node<Integer> tail=null;
public static void insert(int data) {
	Node<Integer> current=new Node<Integer>(data);
	if(head==null) {
		head=current;
		tail=current;
	}else {
		tail.next=current;
		tail=tail.next;
	}
}
public static Node<Integer> deletion(int pos){
	Node<Integer> temp=head;
	Node<Integer> temp1=head;

	if(pos==0) {
		temp=temp.next;
		return temp;
	}
	
	int i=0;
	while(temp!=null) {
		if(pos==i+1) {
			temp.next=temp.next.next;
		}else {
			temp=temp.next;
		}
		i++;
	}
	return temp1;
} 
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Delete List=new Delete();
		List.insert(10);
		List.insert(20);
		List.insert(30);
		List.insert(40);
		List.insert(50);
		int pos=s.nextInt();
		Node<Integer> output=deletion(pos);
		while(output!=null) {
			System.out.println(output.data);
			output=output.next;
		}
}

}
