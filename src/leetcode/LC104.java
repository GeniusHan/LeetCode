package leetcode;

public class LC104 {
    public int maxDepth(TreeNode root) {
        if(root==null) {
        	return 0;
        }
        int leftLength = maxDepth(root.left)+1;
        int rightLength = maxDepth(root.right)+1;
        return leftLength>rightLength ? leftLength : rightLength;
    }
}

