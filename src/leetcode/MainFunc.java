package leetcode;

import java.util.Arrays;
import java.util.List;

public class MainFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] nums = {{0,0,0},{0,1,0},{0,0,0}};
		
		LC078 lc = new LC078();
		
		//List<String> list = lc.generateParenthesis(3);
		

		System.out.print(lc.subsets(new int[] {1,2,3}));
	}

}

//����������
class TreeNode {
  int val;
   TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
