package leetcode;

public class LC105 {
	
	private int[] newPre;
	private int[] newIn;
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || preorder.length==0) return null;
        //前序第一位是根节点
        TreeNode root = new TreeNode(preorder[0]); 
        //中序遍历中根节点左右两边的值是根节点
        int length = preorder.length;
        //找到根节点在中序中的位置
        int rootPosition = findRoot(inorder, preorder[0]);
        newPre = buildArray(preorder, 1, rootPosition+1);
        newIn = buildArray(inorder, 0, rootPosition);
        root.left = buildTree(newPre, newIn);
        newPre = buildArray(preorder, rootPosition+1, length);
        newIn = buildArray(inorder, rootPosition+1, length); 
        root.right = buildTree(newPre, newIn);
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
        Array
        return rootPosition;
    }
    
    private int[] buildArray(int[] inorder, int left, int right) {
    	int[] order = new int[right-left];
    	int pos = 0;
    	for(int i=left; i<right; i++) {
    		order[pos] = inorder[i];
    		pos++;
    	}
    	return order;
    }
    
}
