package leetcode;

public class LC172 {
	
    public int trailingZeroes(int n) {
        if(n<5) return 0;
        int count = 0;
        while(n>=5) {
        	count += n/5;
            n = n/5;
        }
        return count;
    }
}
