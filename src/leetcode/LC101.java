package leetcode;

public class LC101 {
	
    public boolean isSymmetric(TreeNode root) {
        if(root==null) {
        	return true;
        }
        return isSymmetric(root.left, root.right);
    }
    
    private boolean isSymmetric(TreeNode leftRoot, TreeNode rightRoot) {
    	if(leftRoot==null && rightRoot==null) {
    		return true;
    	}
    	if(leftRoot==null || rightRoot==null) {
    		return false;
    	}
    	if(leftRoot.val!=rightRoot.val) {
    		return false;
    	}
    	return isSymmetric(leftRoot.left, rightRoot.right) && isSymmetric(leftRoot.right, rightRoot.left);
    }
}
