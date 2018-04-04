package BlackRock;


public class CommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static TreeNode commonAncestor(TreeNode root, int p, int q){
		
		if(root == null)return null;
		if (root.value == p || root.value == q) return root;
		TreeNode l = commonAncestor(root.left, p ,q);
		TreeNode r = commonAncestor(root.right, p, q);
		
		if(l == null && r == null) return null;
		else if( l != null && r != null) return root;
		else return l != null ? l : r;
	}
	
}

class TreeNode{
	
	TreeNode right;
	TreeNode left;
	int value;
	
	TreeNode(int value){
		this.value = value;
	}
}