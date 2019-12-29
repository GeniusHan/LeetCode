package leetcode;

public class LC110 {
	
	
	
	public boolean isBalanced(TreeNode root) {
	    return getTreeDepth(root) != -1;
	}

	private int getTreeDepth(TreeNode root) {
	    if (root == null) {
	        return 0;
	    }
	    int leftDepth = getTreeDepth(root.left);
	    if (leftDepth == -1) {
	        return -1;
	    }
	    int rightDepth = getTreeDepth(root.right);
	    if (rightDepth == -1) {
	        return -1;
	    }
	    if (Math.abs(leftDepth - rightDepth) > 1) {
	        return -1;
	    }
	    return Math.max(leftDepth, rightDepth) + 1;
	}

	
//    public boolean isBalanced(TreeNode root) {
//        if(root==null) {
//        	return true;
//        }
//        if(Math.abs(calTreeHeight(root.left)-calTreeHeight(root.right))>1){
//        	return false;
//        }
//        return isBalanced(root.left) && isBalanced(root.right);
//    }
//    
//    private int calTreeHeight(TreeNode root) {
//    	if(root==null) {
//    		return 0;
//    	}
//    	int left = calTreeHeight(root.left)+1;
//    	int right = calTreeHeight(root.right)+1;
//    	return left > right ? left : right;
//    }
}
