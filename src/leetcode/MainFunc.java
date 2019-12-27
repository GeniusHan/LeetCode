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
		int[] original = new int[] {1,2,3,4,5,6};
		int[] news = Arrays.copyOfRange(original, 0, 2);

		System.out.print(Arrays.copyOfRange(original, 0, 2).toString());
	}

}

//¶þ²æÊ÷¶¨Òå
class TreeNode {
  int val;
   TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
