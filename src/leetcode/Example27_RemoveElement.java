package leetcode;

public class Example27_RemoveElement {

	
    public int removeElement(int[] nums, int val) {
        
        int len = 0;
        int length = nums.length;
        
        for(int i=0; i<length; i++)
        {
        	if(nums[i] != val)
        	{
        		nums[len++] = nums[i];
        	}
        
        }
        
        return len;
    }
}
