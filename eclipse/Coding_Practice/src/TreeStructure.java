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
		System.out.println("INoRDER : "+ ts.inOrder2());
		System.out.println("PreOrder : " + ts.preOrder());
		System.out.println("PostOrder : " + ts.postOrder());
		System.out.println(ts.findHeight(ts.root));
	
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
	
}
