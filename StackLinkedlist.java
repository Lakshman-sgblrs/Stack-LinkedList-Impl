package stack;
/*Stack linkedList Implementation*/
public class StackLinkedlist {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}
	
	int top=-1;
	
	void push(Node nw){
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		
			temp.next=nw;
			top++;
		}
	
	void pop(){
		Node temp = head;
		Node prev=null;
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}
			if(temp!=head){
				System.out.println(temp.data);
				prev.next=null;}
			else{
				System.out.println(temp.data);
		}
			top--;
	}
		

	boolean isEmpty(){
		return(top<0);
	}
	public static void main(String[] args) {
		StackLinkedlist sl = new StackLinkedlist();
		sl.head = new Node(2);
		Node second = new Node(4);
        Node third  = new Node(3);
        sl.push(second);
        sl.push(third);
        sl.pop();
        sl.pop();
        sl.pop();
        

	}
}
