package leetcode;

public class LC067 {
	 public String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int digit = 0; //½øÎ»
        String result="";
        while(aIndex >= 0 || bIndex >= 0) {
            int sum = digit;
            if(aIndex>=0){
                sum += charToInt(a.charAt(aIndex));
            }
            if(bIndex>=0){
                sum += charToInt(b.charAt(bIndex));
            }
        	digit = sum/2;
        	result = String.valueOf(sum%2) + result;
        	aIndex--;
        	bIndex--;
        }
        if(digit==1) {
        	result = "1"+result;
        }
        return result;
    }
    
    private int charToInt(char c) {
    	//0~9
    	return (int)(c-'0');
    }

}
