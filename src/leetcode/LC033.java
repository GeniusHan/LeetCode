package leetcode;

public class LC033 {

	 public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left + (right-left)/2;

        while(left <= right){
            if(nums[mid] == target){
                return mid;
            }

            if(nums[left] <= nums[mid]){  //×ó±ßÉıĞò
                if(target >= nums[left] && target <= nums[mid]){//ÔÚ×ó±ß·¶Î§ÄÚ
                    right = mid-1;
                }else{//Ö»ÄÜ´ÓÓÒ±ßÕÒ
                    left = mid+1;
                }

            }else{ //ÓÒ±ßÉıĞò
                if(target >= nums[mid] && target <= nums[right]){//ÔÚÓÒ±ß·¶Î§ÄÚ
                    left = mid +1;
                }else{//Ö»ÄÜ´Ó×ó±ßÕÒ
                    right = mid-1;
                }

            }
            mid = left + (right-left)/2;
        }

        return -1;  //Ã»ÕÒµ½
    }
}
