package leetcode;

import java.util.Arrays;

public class LC031 {
	
	
	// �Ӻ���ǰ�ҵ���һ��ǰһλС�ں�һλ���ַ�
    public static void nextPermutation(int[] nums) 
    {
    	int length = nums.length;
    	int index = length - 1;
    	while(index>0 && nums[index]<=nums[index-1])
    	{
    		index--;
    	}
    	if(index==0) //����������
    	{
    		Arrays.sort(nums);
    	}
    	else
    	{
    		int positionNum = nums[index-1];
    		int changePosition=0;
    		Arrays.sort(nums, index-1, length);
    		for(int i= index-1; i<length-1; i++)
    		{
    			if(nums[i]==positionNum && nums[i]<nums[i+1])
    			{
    				changePosition=i+1;
    			}
    		}
    		
    		int temp = nums[index-1];
    		nums[index-1] = nums[changePosition];
    		nums[changePosition] = temp;
    		Arrays.sort(nums, index, length);
    	}
    		
    }
   

}
