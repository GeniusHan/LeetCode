package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC022 {
	
	private List<String> list;
	
    public List<String> generateParenthesis(int n) {
    	
    	list = new ArrayList<String>();
    	generateParenthesis(1, 0, n, "(");
    	return list;
    }
    
    //�ݹ�+��֦
    private void generateParenthesis(int lCount, int rCount, int n, String s){
    	if(lCount < rCount || lCount > n) return;
    	if(rCount==n) {
    		list.add(s);
    		return;
    	}
    	generateParenthesis(lCount+1, rCount, n, s + '(');
    	generateParenthesis(lCount, rCount+1, n, s + ')');
    	return;
    }
    
    //�ж��������Ƿ�������Ŷ�
//    private boolean isLegal(String s, int n) {
//    	if(s=="") return true;
//    	int lCount = s.replace(rightParenthesis, ' ').trim().length();
//    	int rCount = s.replace(leftParenthesis, ' ').trim().length();
//    	if(lCount>=rCount && lCount<=n) {
//    		return true;
//    	}
//    	return false; //�����Ŷ�Ϊ��
//    }

}
