package leetcode;

public class LC168 {
	
	private StringBuilder sb = new StringBuilder();
	
    public String convertToTitle(int n) {
        // ¼Ó64
    	if(n>26) {
    		sb.append(convertToTitle(n-26));
    	}

    	return "";
    }
}
