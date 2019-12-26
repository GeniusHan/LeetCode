package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC098 {

	private TreeNode pre=null;
	//¶þ²æËÑËØÊ÷ÖÐÐò±éÀúµÝÔö
    
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


