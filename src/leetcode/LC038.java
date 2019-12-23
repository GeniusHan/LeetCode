package leetcode;

public class LC038 {

	//±¨Êý
    public String countAndSay(int n) {
        String[] digits = new String[n];
        digits[0]="1";
        digits[1]="11";
        digits[2]="21";
        digits[3]="1211";
        digits[4]="111221";
        if(n<=5) {
        	return digits[n-1];
        }
        int loc = 5;
        while(loc<n) {
        	
        }
    }
}
