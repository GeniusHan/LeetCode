package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LC111 {
	
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int currLayerCount = 0; // ��¼��ǰ��Ľڵ���
        int nextLayerCount = 0; // ��¼��һ��Ľڵ���
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        currLayerCount++;
        int minDepth = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            currLayerCount--;
            // �ҵ���Ҷ�ӽڵ㣬ֱ���˳�
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
            // ��ǰ��Ľڵ�������ˣ�˵��Ҫ������һ���ˣ���ȼ�1
            if (currLayerCount == 0) {
                minDepth++;
                // ���µ�ǰ��ڵ�������һ��ڵ���
                currLayerCount = nextLayerCount;
                nextLayerCount = 0;
            }
        }
        return minDepth;
    }
}
	
	
	
/*************�ݹ�*************/
	
//    public int minDepth(TreeNode root) {
//        if(root==null) {
//        	return 0;
//        }
//    	if(root.left==null && root.right==null) { //Ҷ�ӽڵ�
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

