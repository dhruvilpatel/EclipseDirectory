
public class DoubleLinkedList {

	 int data;
	
	DoubleLinkedList prev;
	DoubleLinkedList next;
	
	DoubleLinkedList(int data){
		this.data = data;
	}
	DoubleLinkedList(DoubleLinkedList prev,int data, DoubleLinkedList next){
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	
	public int Data(){
		return data;
	}
}
class SingleLinkedList {
	int data; 
	SingleLinkedList next;
	
	SingleLinkedList(int data){
		this.data = data;
	}
	
	SingleLinkedList (int data, SingleLinkedList next){
		this.data = data;
		this.next = next;
	}
	
	public int Data(){
		return data;
	}
	
}
class TreeNode{
	
	int data;
	TreeNode right;
	TreeNode left;
	
	TreeNode(int data){
		this.data = data;
	}
	TreeNode(TreeNode left, int data , TreeNode right){
		this.left = left;
		this.data = data;
		this.right = right;
	}
	
	public int Data(){
		return data;
	}
	
}