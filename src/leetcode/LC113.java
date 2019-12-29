package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC113 {
	
	private List<Integer> list = new ArrayList<Integer>();
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) {
        	return null;
        }
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int count, int sum) {
        if(root.left!=null) {
        	if()
        	list.add(root.left);
        	return null;
        }
    }
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) {
        	return false;
        }
        if(root.left==null && root.right==null) {
        	return sum==root.val ? true : false;
        }
        if(root.left!=null && root.right==null) {
        	return hasPathSum(root.left,sum-root.val);
        }
        if(root.left==null && root.right!=null) {
        	return hasPathSum(root.right,sum-root.val);
        }
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}
