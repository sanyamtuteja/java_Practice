package NanshuPractice;

import java.util.HashMap;

public class RemovedupsfromlinkedList {
	
	public Node removeDups(Node head)
	{
		HashMap<Integer, Integer> ht=new HashMap<Integer, Integer>();
		
		if(head==null){
			return null;
		}
		
		Node currnode=head.next;
		Node prevnode=head;
		Node temp;
		ht.put(head.data, 1);
		System.out.println("its hashtable1" + ht);
		while(currnode!=null){
			
			int data=currnode.data;
			
			if(ht.containsKey(data)){
				
				prevnode.next=currnode.next;
				currnode=currnode.next;
				
			}else
			{
				 ht.put(data, 1);
	                prevnode = currnode;
	                currnode = currnode.next;
			}
		}
		System.out.println(head);
		return head;
		
		
	}
	
	public void display(Node head){
        Node n=head;
        while(n!=null){
            System.out.print("->" + n.data);
            n=n.next;
        }
    }
	public static void main(String[] args) {
		Node n = new Node(2);
        n.next = new Node(3);
        n.next.next = new Node(4);
        n.next.next.next = new Node(5);
        n.next.next.next.next = new Node(6);
        n.next.next.next.next.next = new Node(7);
        n.next.next.next.next.next.next = new Node(2);
        System.out.print("Original List : ");
        RemovedupsfromlinkedList rm = new RemovedupsfromlinkedList();
        rm.display(n);
        System.out.print("\n Updated List: ");
        Node x =rm.removeDups(n);
        rm.display(x);
    }
}


