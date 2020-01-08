package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC040 {
	
	private List<List<Integer>> result; 
	private List<Integer> list; 
	
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<List<Integer>>();
        list = new ArrayList<Integer>();
        Arrays.sort(candidates);
        if(candidates==null || candidates.length==0 || target==0) {
        	return result;
        }
        DFS(candidates, 0, target);
        return result;
    }
    
    //candidates = [10,1,2,7,6,1,5], target = 8,
    private void DFS(int[] candidates, int index, int target) {
    	if(target==0) {
    		result.add(new ArrayList<Integer>(list));
    		return;
    	}
    	for(int i=index; i<candidates.length && target>=candidates[i]; i++) {
    		if(i>index && candidates[i]==candidates[i-1]) {
    			continue;
    		}
    		list.add(candidates[i]);
    		DFS(candidates, i+1, target-candidates[i]);
    		list.remove(list.size()-1);
    	}
    }
}
