import java.util.Stack;


public class SingleListFunctions {
	static SingleListFunctions sf  =  new SingleListFunctions();
	static SingleLinkedList head;

	int size ;
	public SingleListFunctions(){
		head = null;
		size = 0;
	}
	
	void addRear(int value){
		
		if(head == null){
			head = new SingleLinkedList(value);
		}
		else{
		SingleLinkedList current = head;
		while(current.next != null){
			current = current.next;
		}
		SingleLinkedList newlink = new SingleLinkedList(value, null);
		current.next = newlink;
		}
	}
		
	public void Print(){
		SingleLinkedList current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	boolean isPalidrome(SingleLinkedList head){
		
		SingleLinkedList fast = head;
		SingleLinkedList slow = head;
		Stack<Integer> stack = new Stack<Integer>();
		
		while (fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null){
			slow = slow.next;
		}
		while ( slow != null){
			int top = stack.pop();
			
			if(top != slow.data){
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}
	boolean hasCircular(SingleLinkedList head){
		SingleLinkedList fast = head;
		SingleLinkedList slow = head;
		
		while (fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if ( slow == fast ){
				break;
			}
		}
		if(fast == null || fast.next == null){
			return false;
		}
		
		slow = head;
		
		while ( slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	
	public static void main (String args[]){
		
		sf.addRear(1);
		sf.addRear(2);
		sf.addRear(3);
		sf.addRear(4);
		sf.addRear(5);
		sf.addRear(6);
		sf.addRear(7);
		
		sf.Print();
		System.out.println("----------------------------------------------");
		
		System.out.println("-----------------half-----------------------------");
		sf.reverseReverse(head,null);
		sf.Print();
		System.out.print(" Circular : " + sf.hasCircular(head));
		KthtotheLastElement(head,3);
		deleteNodeGivenOnlyAccessToThatNode(head);
		System.out.println("-----------------After Deletion-----------------------------");
		sf.Print();
		
	}
	
	public SingleLinkedList isPalindrome(SingleLinkedList head) {
		
			
		SingleLinkedList fast = head, slow = head, prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		reverse(slow);
		return slow;
//		while (head != null && slow != null) {
//			if (head.data != slow.data)
//				return false;
//			head = head.next;
//			slow = slow.next;
//		}
//	    return true;
	}

	void reverse(SingleLinkedList node) {
		
		head = null;
		SingleLinkedList fast = node;
		SingleLinkedList slow = node;
		Stack<Integer> stack = new Stack<Integer>();
		
		while (fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null){
			stack.push(slow.data);
			slow = slow.next;
		}
		while ( !stack.isEmpty()){
			int top = stack.pop();
			addRear(top);
			
		}
		while(slow!=null){
			addRear(slow.data);
			slow = slow.next;
		}
		
//		 SingleLinkedList prev = null;
//		 SingleLinkedList current = node;
//		 SingleLinkedList next = null;
//	        while (current != null) {
//	            next = current.next;
//	            current.next = prev;
//	            prev = current;
//	            current = next;
//	        }
//	        node = prev;
//	        return node;
	    }
	
	
//	private static SingleLinkedList reverse(SingleLinkedList slow) {
//		SingleLinkedList prev = null, head = slow, cur = slow;
//		while (cur != null) {
//			SingleLinkedList next = cur.next;
//			cur.next = prev;
//			prev = cur;
//			cur = next;
//		}
//		sf.Print();
//		return prev;
//	}
	
	public static void reverseLastHalf(SingleLinkedList list){
		
		SingleLinkedList finalAnswer = list;
		SingleLinkedList slow = list;
		SingleLinkedList fast = list;
		
		while(fast != null && fast.next != null){
			finalAnswer = slow;
			slow=slow.next;
			fast = fast.next.next;
		}
		SingleLinkedList temp = null;
		SingleLinkedList prev = null;
		
		while(slow!=null){
			temp = slow.next;
			slow.next = prev;
			prev = slow;
			slow = temp;
			
			
			
		}
		
		finalAnswer.next = prev;
		
		
	}
	
public static void completeReverse(SingleLinkedList current){
		
		SingleLinkedList temp = null;
		SingleLinkedList prev = null;
		
		while(current!=null){
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
			
			
			
		}
		
		head = prev;
		
		
	}

public static void reverseFirstHalf(SingleLinkedList current){
	
	SingleLinkedList temp = null;
	SingleLinkedList prev = null;

	SingleLinkedList fast = current;
	SingleLinkedList finalAnswer = current;
	
	
	while(fast != null && fast.next != null){
		fast = fast.next.next;
		temp = current.next;
		current.next = prev;
		prev = current;
		current = temp;
	}
	
	head = prev;
	finalAnswer.next = temp;
	
	
}
// Time Complexity - O(n) and Space Complexity - O(1)
public static void KthtotheLastElement(SingleLinkedList node, int k){
	
	SingleLinkedList slow = node;
	SingleLinkedList fast= node;
	
	for(int i=0 ;i<k-1;i++){
		if(fast == null) System.out.println("No Kth Element available");
		else fast = fast.next;
	}
	
	if(fast == null) System.out.println("No Kth Element available");
	
	while(fast.next != null){
		slow = slow.next;
		fast = fast.next;
	}
	
	
	System.out.println("Kth Element will be : " + slow.data);
}
 
public static void deleteNodeGivenOnlyAccessToThatNode(SingleLinkedList node){
	
	if(node == null || node.next == null ) System.out.println("NOde cannot be Deleted");
	
	if(node.next != null){
		
		SingleLinkedList next = node.next;
		node.data = next.data;
		node.next = next.next;
		System.out.println("Node Deleted");	
	}
	
	
}

//public SingleLinkedList recurseReverse(SingleLinkedList list)
//{
//    if (list == null || list.next == null) return list;
//    SingleLinkedList reverseRest = recurseReverse(list.next);
//    list.next.next = list;
//    list.next = null;
//   
//    return reverseRest;
//}

//A simple and tail recursive function to reverse
// a linked list.  prev is passed as NULL initially.
SingleLinkedList reverseReverse(SingleLinkedList curr, SingleLinkedList prev) {

    /* If last node mark it head*/
    if (curr.next == null) {
        head = curr;

        /* Update next to prev node */
        curr.next = prev;
        return null;
    }

    /* Save curr->next node for recursive call */
    SingleLinkedList next1 = curr.next;

    /* and update next ..*/
    curr.next = prev;

    reverseReverse(next1, curr);
    return head;
}
}

class LinkListCreation{
	public int data;
	LinkListCreation next;
	
	public LinkListCreation(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	
	
	
}
