package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC078 {
	
	private List<List<Integer>> result;
	private List<Integer> list;
	
    public List<List<Integer>> subsets(int[] nums) {
    	result = new ArrayList<List<Integer>>();
    	if(nums==null || nums.length==0) {
    		return result;
    	}
    	list = new ArrayList<Integer>();
    	for(int i=0; i<=nums.length; i++) {
    		DFS(nums, i, 0, 0);
    	}
    	return result;
    }
    
    //数组 子集大小 当前位置 list大小
    private void DFS(int[] nums, int k, int index, int count) {
    	if(count==k) {
    		result.add(new ArrayList<Integer>(list));
    	} else {
    		for(int i=index; i<nums.length;i++) {
    			list.add(nums[i]);
    			DFS(nums, k, i+1, count+1);
    			list.remove(list.size()-1);
    		}
    	}
    }
}
