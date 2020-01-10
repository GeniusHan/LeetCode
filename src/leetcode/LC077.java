package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC077 {
	private List<List<Integer>> result;
	private List<Integer> list;
	
    public List<List<Integer>> combine(int n, int k) {
    	result = new ArrayList<List<Integer>>();
    	list = new ArrayList<Integer>();
    	DFS(n, k, 1, 0);
    	return result;
    }
    
    //n = 4, k = 2
    private void DFS(int n, int k, int index, int count) {
    	if(count==k) {
			result.add(new ArrayList<Integer>(list));
    	} else {
    		for(int i=index; i<=n-k+1; i++) {
    			list.add(i);
    			DFS(n, k, i+1, count+1);
    			list.remove(list.size()-1);
    		}
    	}
    }
}
