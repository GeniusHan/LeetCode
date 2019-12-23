package leetcode;

public class Example33_Search {

	
	public int search(int[] nums, int target) 
	{
		int index = -1;
		
		int len = nums.length;
		// ¶þ·Ö
		int low = 0;
		int hight = len - 1;
		while(low < hight)
		{
			int middle = (low + hight)/2;
			int compareNum = nums[middle];
			if(target < compareNum)
			{
				hight = middle-1;
			}
			else if(target > compareNum)
			{
				low = middle+1;
			}
			else
			{
				index = middle;
				break;
			}
		}
		return index;
    }
}
