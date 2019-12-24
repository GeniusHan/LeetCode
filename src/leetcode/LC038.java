package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC038 {

	//����
    public String countAndSay(int n) {
    	if(n==1) return "1";
    	
    	String pre = "1";
        int loc = 1;
        while(loc!=n) {
        	//�и��ַ���
        	pre = splitString(pre);
        	loc++;
        }
        return pre;
    }
    
    //�������
	//������һ���ַ���
    private String countNum(String str) {
    	return String.valueOf(str.length()).concat(String.valueOf(str.charAt(0)));
    }
    
    //�и��ַ��� "111221"
    private String splitString(String digits){
    	
    	StringBuilder sb = new StringBuilder();
    	int begin = 0;
    	int end = 1;
    	int length = digits.length();
    	while(end<length) {
    		if(digits.charAt(end) != digits.charAt(end-1)) {
    			sb.append(countNum(digits.substring(begin, end)));
    			//�����µ��ַ�������being end
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
