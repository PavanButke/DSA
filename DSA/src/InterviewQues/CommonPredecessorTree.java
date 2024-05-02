package InterviewQues;


public class CommonPredecessorTree{
	
	public static void main(String ...args)
	{
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.left.right = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.right = new TreeNode(11);
		root.right.left= new TreeNode(7);
		root.right.right= new TreeNode(18);
		root.left.right.left = new TreeNode(4);
		root.left.right.right = new TreeNode(9);
		
		
		CommonPredecessorTree sol= new CommonPredecessorTree();
		TreeNode p= root.left;//with 3
		TreeNode q= root.left.right.right; //with 9
		
		TreeNode cPT = sol.findCPT(root, p , q);
		System.out.println(cPT.val);
	}

	private TreeNode findCPT(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root==null || root==p || root==q)
		{
			return root;
			
		}
		
		TreeNode left = findCPT(root.left , p, q);
		TreeNode right = findCPT(root.right, p, q);
		
		if(left != null && right !=null)
		{
			return root;
		}
		
		
		return (left!=null) ?  left: right;
	}
	
}