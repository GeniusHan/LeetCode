package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LC111 {
	
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int currLayerCount = 0; // 记录当前层的节点数
        int nextLayerCount = 0; // 记录下一层的节点数
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        currLayerCount++;
        int minDepth = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            currLayerCount--;
            // 找到的叶子节点，直接退出
            if (node.left == null && node.right == null) {
                break;
            }
            if (node.left != null) {
                queue.offer(node.left);
                nextLayerCount++;
            }
            if (node.right != null ) {
                queue.offer(node.right);
                nextLayerCount++;
            }
            // 当前层的节点遍历完了，说明要进入下一层了，深度加1
            if (currLayerCount == 0) {
                minDepth++;
                // 更新当前层节点数和下一层节点数
                currLayerCount = nextLayerCount;
                nextLayerCount = 0;
            }
        }
        return minDepth;
    }
}
	
	
	
/*************递归*************/
	
//    public int minDepth(TreeNode root) {
//        if(root==null) {
//        	return 0;
//        }
//    	if(root.left==null && root.right==null) { //叶子节点
//    		return 1;
//    	}
//    	if(root.left!=null && root.right==null) {
//    		return minDepth(root.left)+1;
//    	} 
//    	if(root.right!=null && root.left==null) {
//    		return minDepth(root.right)+1;
//    	} 
//		int leftDepth =  minDepth(root.left);
//		int rigthDepth = minDepth(root.right);
//		return Math.min(leftDepth, rigthDepth)+1;
//    }

