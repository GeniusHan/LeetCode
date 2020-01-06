package leetcode;

/*
    *  ����һ�������������е��������� nums����һ��Ŀ��ֵ target���ҳ�����Ŀ��ֵ�������еĿ�ʼλ�úͽ���λ�á�
 */
public class LC034 {
    public int[] searchRange(int[] nums, int target) {
    	if(nums==null || nums.length==0) return new int[] {-1, -1};
        
        int targetPosition = binarySearch(nums, target);
        if(targetPosition==-1) {
        	return new int[] {-1, -1};
        }
        int start = targetPosition, end = targetPosition;
        while(start!=0 && nums[start]==nums[start-1]) {
        	start--;
        }
        while(end!=nums.length-1 && nums[end]==nums[end+1]) {
        	end++;
        }
        return new int[] {start, end};
    }
    
    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right) {
        	int mid = left + (right-left)/2;
        	if(nums[mid]==target) {
        		//
        		return mid;
        	} else if(nums[mid]>target) {
        		right = mid-1;
        	} else {
        		left = mid+1;
        	}
        }
        return -1;
    }
}
