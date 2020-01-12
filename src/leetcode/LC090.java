package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC090 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
	    List<List<Integer>> ans = new ArrayList<>();
	    Arrays.sort(nums); //����
	    getAns(nums, 0, new ArrayList<>(), ans);
	    return ans;
	}

	private void getAns(int[] nums, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
	    ans.add(new ArrayList<>(temp));
	    for (int i = start; i < nums.length; i++) {
	        //���ϸ�������Ⱦ�����
	        if (i > start && nums[i] == nums[i - 1]) {
	            continue;
	        }
	        temp.add(nums[i]);
	        getAns(nums, i + 1, temp, ans);
	        temp.remove(temp.size() - 1);
	    }
	}
}