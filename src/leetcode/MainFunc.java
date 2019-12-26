package leetcode;

import java.util.Arrays;
import java.util.List;

public class MainFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] nums = {{0,0,0},{0,1,0},{0,0,0}};
		
		LC038 lc = new LC038();
		
		//List<String> list = lc.generateParenthesis(3);
		
		//System.out.println(list);

		System.out.print(lc.countAndSay(10));
	}

}

//¶þ²æÊ÷¶¨Òå
class TreeNode {
  int val;
   TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
