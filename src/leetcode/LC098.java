package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC098 {

	private TreeNode pre=null;
	//二叉搜素树中序遍历递增
    
    public boolean isValidBST(TreeNode root) {
        if(root==null) {
        	return true;
        }
        if(!isValidBST(root.left)) {
        	return false;
        }
        if(pre!=null && pre.val>=root.val) {
        	return false;
        }
        pre = root;
        if(!isValidBST(root.right)) {
        	return false;
        }
        return true;
    }
}

//二叉树定义
class TreeNode {
    int val;
     TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
