package leetcode;

import java.util.Arrays;

public class LC106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	int length = postorder.length;
    	if(length==0) return null;
        //后序最后一位是根节点
        TreeNode root = new TreeNode(postorder[length-1]);
        int rootPosition = findRoot(inorder, postorder[length-1]);
        root.left = buildTree(Arrays.copyOfRange(inorder, 0, rootPosition), Arrays.copyOfRange(postorder, 0, rootPosition));
        root.right = buildTree(Arrays.copyOfRange(inorder, rootPosition+1, length), Arrays.copyOfRange(postorder, rootPosition, length-1));
        return root;
    }
    
    private int findRoot(int[] inorder, int root) {
    	int length = inorder.length;
    	int rootPosition=0;
        for(int i=0; i<length; i++) {
        	if(inorder[i]==root) {
        		rootPosition=i;
        		break;
        	}
        }
        return rootPosition;
    }
}
