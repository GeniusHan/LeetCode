package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC114 {
	
	private List<TreeNode> list = new ArrayList<TreeNode>();
	//原地展开
    public void flatten(TreeNode root) {
    	if(root==null) return;
    	if(root.left!=null) {
    		f(root,root.left);
    	}
    	

    }
    
    private TreeNode f(TreeNode pre,TreeNode root) {
    	if(root.left==null && root.right==null) {
    		return root;
    	}
    	pre.left=null;
    	pre.right=root;
    	TreeNode left = root.left;
    	TreeNode right = root.right;
    	TreeNode l = f(root,left);
    	return f(l, right);
    }
}
