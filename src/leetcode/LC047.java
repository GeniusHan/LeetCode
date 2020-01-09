package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC047 {
    
	private List<List<Integer>> result;
	private List<Integer> list;
	public List<List<Integer>> permuteUnique(int[] nums) {
		result = new ArrayList<List<Integer>>();
    	if(nums==null || nums.length==0) {
    		return result;
    	}
    	list = new ArrayList<Integer>();
    	Arrays.sort(nums);
    	int[] visited = new int[nums.length];
    	DFS(nums,0,visited);
    	return result;
    }
	
	private void DFS(int[] nums, int index, int[] visited) {
		if(index==nums.length) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=0; i<nums.length; i++) {
			if(visited[i]==0) {
				//前一个节点没有访问过 说明前一个节点和当前节点在同一层
				if((i>0 && nums[i]==nums[i-1] && visited[i-1]==0)) {
					continue;
				} 
				list.add(nums[i]);
				visited[i]=1;
				DFS(nums, index+1, visited);
				list.remove(list.size()-1);
				visited[i]=0;
			}

		}
	}
}
