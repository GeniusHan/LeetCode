package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC039 {
	private List<List<Integer>> result; 
	private List<Integer> list; 
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	result = new ArrayList<List<Integer>>();
    	list = new ArrayList<Integer>();
    	Arrays.sort(candidates);
    	if(target<candidates[0]) {
    		return result;
    	}
    	combinationSum(candidates, 0, target);
    	return result;
	}
	
	private void combinationSum(int[] candidates,int index, int target){
		if(target==0) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=index; i<candidates.length && target>=candidates[i]; i++) {
			list.add(candidates[i]);
			combinationSum(candidates,i,target-candidates[i]);
			list.remove(list.size()-1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private List<List<Integer>> result; //= new ArrayList<List<Integer>>();
	private List<Integer> list; //= new ArrayList<Integer>();
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	result = new ArrayList<List<Integer>>();
    	list = new ArrayList<Integer>();
    	Arrays.sort(candidates);
    	if(target<candidates[0]) {
    		return result;
    	}
    	combinationSum(candidates, 0, target);
    	return result;
    }
    
    //index³õÊ¼ÎªÁã
    private void combinationSum(int[] candidates,int index, int target){
    	if(index>=candidates.length || candidates[index]>target) {
    		return;
    	}
    	if(candidates[index]==target) {
    		list.add(candidates[index]);
    		result.add(new ArrayList<Integer>(list));
    		list.remove(list.size()-1);
    	} else {
    		list.add(candidates[index]);
    		combinationSum(candidates, index, target-candidates[index]);
    		list.remove(list.size()-1);
    	}
    	combinationSum(candidates, index+1, target);
    }
	 */
	

}
