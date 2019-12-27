package leetcode;

public class LC108 {
    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums==null || nums.length==0) {
    		return null;
		}
    	//TreeNode root = new TreeNode(nums[nums.length])
    	return sortedArrayToBST(nums, 0, nums.length-1);
        
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
    	if(start>end) return null;
    	if(start==end) {
    		return new TreeNode(nums[start]);
    	}
    	int mid = start + (end-start+1)/2;
    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = sortedArrayToBST(nums,start, mid-1);
    	root.right = sortedArrayToBST(nums,mid+1,end);
        return root;
    }
}
