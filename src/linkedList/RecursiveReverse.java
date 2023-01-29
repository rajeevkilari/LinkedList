package linkedList;

public class RecursiveReverse {
	
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
   public static Node<Integer> Reverse(Node<Integer> head){
	   Node<Integer> temp=head;
	   if(temp==null) {
		   return null;
	   }
	   if(temp.next==null) {
		   return temp;
	   }
	  Node<Integer> temp1=Reverse(head.next);
	 System.out.println(temp1.data);
      return temp;
   }
	public static void main(String[] args) {
		
		RecursiveReverse List=new RecursiveReverse();
		List.insert(1);
		List.insert(2);
		List.insert(3);
		List.insert(4);
		List.insert(5);
		Node<Integer> output=Reverse(head);
		/*while(output!=null) {
			System.out.println(output.data);
			output=output.next;
		}*/
	}

}
