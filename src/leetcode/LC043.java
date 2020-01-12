package leetcode;

public class LC043 {
    public String multiply(String num1, String num2) {
    	if(num1.charAt(0)=='0' || num2.charAt(0)=='0') {
    		return "0";
    	}
    	int l2 = num2.length();
    	String s1 = "0";
    	for(int i=l2-1; i>=0; i--) {
    		String s2 = multiply(num1, num2.charAt(i), l2-1-i);
    		s1 = plus(s1, s2);
    	}
    	return s1;
    }
    
    
    private String f(String num1, String num2) {
    	if(num1.charAt(0)=='0' || num2.charAt(0)=='0') {
    		return "0";
    	}
    	int l2 = num2.length();
    	int num = 0;
    }

    //两数相加
    private String plus(String num1, String num2) {
    	StringBuilder sb = new StringBuilder();
    	int l1 = num1.length();
    	int l2 = num2.length();
    	int carryBit = 0;
    	while(l1>0 || l2>0) {
    		if(l1>0) {
    			carryBit += num1.charAt(l1-1)-'0';
    		}
    		if(l2>0) {
    			carryBit += num2.charAt(l2-1)-'0';
    		}
    		sb.append(carryBit%10);
    		carryBit = carryBit/10;
    		l1--;
    		l2--;
    	}
    	if(carryBit>0) {
    		sb.append(carryBit);
    	}
    	return sb.reverse().toString();
    }
    
    //根据num2的位置增加index
    private String multiply(String num1, char num2, int index) {
    	StringBuilder sb = new StringBuilder();
    	int l1 = num1.length();
    	int carryBit = 0;
    	while(l1>0) {
    		carryBit += (num1.charAt(l1-1)-'0')*(num2-'0');
    		sb.append(carryBit%10);
    		carryBit = carryBit/10;
    		l1--;
    	}
    	if(carryBit>0) {
    		sb.append(carryBit);
    	}
    	while(index>0) {
    		sb.insert(0, '0');
    		index--;
    	}
    	return sb.reverse().toString();
    }
    
}
