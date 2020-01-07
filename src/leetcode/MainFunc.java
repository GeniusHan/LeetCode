package leetcode;

import java.util.Arrays;
import java.util.List;

public class MainFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] nums = {{0,0,0},{0,1,0},{0,0,0}};
		
		LC039 lc = new LC039();
		
		//List<String> list = lc.generateParenthesis(3);
		

		System.out.print(lc.combinationSum(new int[]{2,3,6,7}, 7));
	}

}

//¶þ²æÊ÷¶¨Òå
class TreeNode {
  int val;
   TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
