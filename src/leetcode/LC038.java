package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC038 {

	//报数
    public String countAndSay(int n) {
    	if(n==1) return "1";
    	
    	String pre = "1";
        int loc = 1;
        while(loc!=n) {
        	//切割字符串
        	pre = splitString(pre);
        	loc++;
        }
        return pre;
    }
    
    //计算个数
	//生成下一个字符串
    private String countNum(String str) {
    	return String.valueOf(str.length()).concat(String.valueOf(str.charAt(0)));
    }
    
    //切割字符串 "111221"
    private String splitString(String digits){
    	
    	StringBuilder sb = new StringBuilder();
    	int begin = 0;
    	int end = 1;
    	int length = digits.length();
    	while(end<length) {
    		if(digits.charAt(end) != digits.charAt(end-1)) {
    			sb.append(countNum(digits.substring(begin, end)));
    			//遇到新的字符，重置being end
    			begin = end;
    			end = begin + 1;
    			continue;
    		}
    		end++;
    	}
    	sb.append(countNum(digits.substring(begin, end)));
    	return sb.toString();
    }
}
