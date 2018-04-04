import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TreeStructure {
	TreeNode root;
	public TreeStructure(){
		root = null;
	
	}
	  void addNode(int data){
			TreeNode newlink = new TreeNode(null,data,null);

		if(root==null ){
			root = newlink;
			return;
		}
		else{
			TreeNode current = root;
			TreeNode parent = null;
			while(true){
				parent = current;
			if(data < current.data){
				
				current = current.left;
				if(current==null){
					parent.left = newlink;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newlink;
					return;
				}
			}
		}
			

			
		}
	}
	  String inOrder(){
		  String inorder = "";
		  TreeNode current = root;
		  Stack s = new Stack();
			if (root == null){
				return "";	
			}
		  while(!s.isEmpty()||current != null){
			  if(current != null){
				  s.push(current);
				  current = current.left;
				  
			  }else{
				  TreeNode t = (TreeNode) s.pop();
				  inorder += Integer.toString(t.data) + " ";
				  current = t.right;
			  }
		  }
		  
		  
/*		  while(!s.isEmpty()){
			  TreeNode top = (TreeNode) s.peek();
			  if(top.left == null){
				  TreeNode pop = (TreeNode) s.pop();
				  inorder += Integer.toString(pop.data) + " ";
				  if(pop.right!=null){
					  top = pop.right;
					  s.push(top);
				  }
				  top =(TreeNode)  s.pop();
				  inorder += Integer.toString(top.data) + " ";
				  top = top.right;
				  s.push(top);
			  }else{
		  top =top.left;
		  s.push(top);
			  }
		  
		  }*/
		  
		  
		  return inorder;
	  }
	  int findHeight(TreeNode aNode) {
		    if (aNode == null) {
		        return -1;
		    }

		    int lefth = findHeight(aNode.left);
		    int righth = findHeight(aNode.right);

		    if (lefth > righth) {
		        return lefth + 1;
		    } else {
		        return righth + 1;
		    }
		}	
	public static void main(String args[]){
		
		TreeStructure ts = new TreeStructure();
		ts.addNode(5);
		ts.addNode(8);
		ts.addNode(3);
		ts.addNode(1);
		ts.addNode(2);
		ts.addNode(6);
		ts.addNode(9);
		ts.iterativeInoder();
		System.out.println("INoRDER : "+ ts.inOrder2());
		ts.iterativePreorder();
		System.out.println("PreOrder : " + ts.preOrder());
		ts.iterativePostorder();
		System.out.println("PostOrder : " + ts.postOrder());
		System.out.println(ts.findHeight(ts.root));
		
		System.out.println(ts.findHeight2());
		ts.BFS();
		ts.DFS(ts.root);
		System.out.println("Common Ancestor: " + ts.lowestCommonAncestor(ts.root, ts.root.left.right,ts.root.left.left).data);
	
		}
	
	String inOrder2(){
		  String inorder = "";
		  TreeNode current = root;
		  
		  Stack st = new Stack();
		  
		  while(!st.isEmpty() || current != null){
			  if(current != null){
			  st.push(current);
			  current = current.left;
			  }
			  else{
				  TreeNode t = (TreeNode) st.pop();
				  inorder += Integer.toString(t.data) + " ";
				  current = t.right;
			  }
			  
		  }
		  return inorder;
	}
	
	String preOrder(){
		  String preorder = "";
		  TreeNode current = root;
		  
		  Stack st = new Stack();
		  
		  while(!st.isEmpty() || current != null){
			  if(current != null){
				  preorder += Integer.toString(current.data) + " ";
			  st.push(current);
			  current = current.left;
			  }
			  else{
				  TreeNode t = (TreeNode) st.pop();
				 
				  current = t.right;
			  }
			  
		  }
		  return preorder;
	}
	
	String postOrder(){
		  String postorder = "";
		  TreeNode current = root;
		  
		  Stack st1 = new Stack();
		  Stack st2 = new Stack();
		  
		  st1.push(current);
		  
		  while(!st1.isEmpty()){
			  TreeNode t = (TreeNode) st1.pop();
			  st2.push(t);
			  if(t.left!= null){
				  st1.push(t.left);
			  }
			  if(t.right != null){
				  st1.push(t.right);
			  }
			  
		  }
		  while(!st2.isEmpty()){
			  TreeNode t = (TreeNode )st2.pop();
			  postorder += t.data;
		  }
		  
		  return postorder;
	}
	
	int findHeight2(){
		TreeNode current = root;
		int height = -1;
		Queue q = new LinkedList<TreeNode>();
		q.add(current);
		
		while(true){
			
			int nC = q.size();
			if(nC == 0) return height;
			height++;
			
			while(nC > 0){
				TreeNode curr = (TreeNode) q.remove();
				if(curr.left != null) q.add(curr.left);
				if(curr.right != null) q.add(curr.right);
				nC--;
			}
		}
		
	}
	
	void iterativePreorder(){
		System.out.print("Iterative Preorder: ");
		TreeNode current = root;
		
		Stack st = new Stack();
		
		while(!st.isEmpty() || current != null){
			
			if(current != null){
				System.out.print(current.data + " ");
				st.push(current);
				current = current.left;
			}
			else{
				TreeNode top = (TreeNode) st.pop();
				current = top.right;
			}
			
			
		}
		System.out.println("");
	}
	
	void iterativePostorder(){
		
		TreeNode current = root;
		Stack st1= new Stack();
		Stack st2= new Stack();
		st1.push(current);
		while(!st1.isEmpty()){
			
			TreeNode top = (TreeNode) st1.pop();
			st2.push(top);
			
			if(top.left != null) st1.push(top.left);
			if(top.right != null) st1.push(top.right);
			
		}
		System.out.print("Postorder Iterative: ");
		while(!st2.isEmpty()){
			
			TreeNode top = (TreeNode) st2.pop();
			System.out.print(top.data + " ");
			
		}
		System.out.println("");
		
	}
	
	void iterativeInoder(){
		System.out.print("Inorder Iterative: ");
		
		TreeNode current = root;
		
		Stack st = new Stack();
		while(!st.isEmpty() || current != null){
			
			if(current != null){
				st.push(current);
				current = current.left;
			}
			else{
				TreeNode t = (TreeNode) st.pop();
				System.out.print(t.data + " ");
				current = t.right;
			}
			
			
		}
		System.out.println("");
	}
	
	void BFS(){
		TreeNode current = root;
		System.out.print("BFS: ");
		Queue q = new LinkedList();
		q.add(current);
		current.visited = true;
		
		while(!q.isEmpty()){
			TreeNode top = (TreeNode) q.remove();
			System.out.print(top.data + " ");
			if(top.left != null) q.add(top.left);
			if(top.right != null) q.add(top.right);
			
			
		}
		System.out.println("");
	}
	
	void DFS(TreeNode curr){
		
		if(curr == null) return;
		curr.visited = true;
		System.out.print(curr.data + " ");
		
		 DFS(curr.left);
		 DFS(curr.right);
		
	}
	
	 TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    if(root==null)
	        return null;
	 
	    if(root==p || root==q)
	        return root;
	 
	    TreeNode l = lowestCommonAncestor(root.left, p, q);
	    TreeNode r = lowestCommonAncestor(root.right, p, q);
	 
	    if(l!=null&&r!=null){
	        return root;
	    }else if(l==null&&r==null){
	        return null;
	    }else{
	        return l==null?r:l;
	    }
	}
}
