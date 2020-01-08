package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC046 {
	
	private List<List<Integer>> result;
	private List<Integer> list;
	
    public List<List<Integer>> permute(int[] nums) {
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
    
    
    private void DFS(int[] nums, int len, int[] visited) {
    	if(len==nums.length) {
    		result.add(new ArrayList<Integer>(list));
    	}
    	for(int i=0; i<nums.length; i++) {
    		if(visited[i]==1) {
    			continue;
    		}
    		list.add(nums[i]);
    		visited[i]=1;
    		DFS(nums, len+1, visited);
    		list.remove(list.size()-1);
    		visited[i]=0;
    	}
    }
    /*
    private void DFS(int[] nums) {
    	int index = nums.length;
    	int count = nums.length;
    	for(int i=0; i<index; i++) {
    		list = new ArrayList<Integer>();
    		list.add(nums[i]);
    		for(int j=0; j<count; j++) {
    			if(list.contains(nums[j])) {
    				continue;
    			}
    			list.add(nums[j]);
    			DFS(nums)
    		}
    		result.add(new ArrayList<Integer>(list));
    	}
    }
    */
    private void DFS(int[] nums, int index, int count) {
    	if(index==nums.length) {
    		result.add(new ArrayList<Integer>(list));
    		count=0;
    		index++;
    	}
    	for(int i=index; i<nums.length; i++) {
    		list.add(nums[i]);
    		DFS(nums,index+1,count);
    		list.remove(list.size()-1);
    		if(list.contains(nums[i])) {
    			
    		}
    	}
    }
}
