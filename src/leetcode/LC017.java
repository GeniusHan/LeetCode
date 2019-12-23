package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
 * DFS 
 */
public class LC017 {
	
	private Map<Character,String> map;
	private List<String> result = new ArrayList<String>();
	
    public List<String> letterCombinations(String digits) {
    	if(digits.length()==0) return result;
    	
    	map = new HashMap<Character,String>();
    	map.put('2', "abc");
    	map.put('3', "def");
    	map.put('4', "ghi");
    	map.put('5', "jkl");
    	map.put('6', "mno");
    	map.put('7', "pqrs");
    	map.put('8', "tuv");
    	map.put('9', "wxyz");
        char[] dgs = digits.toCharArray();

        letterCombinations(0, dgs, "");
        
        return result;
    }
    
    private void letterCombinations(int index, char[] dgs, String str) {
    	if(index == dgs.length) {
    		result.add(str);
    		return;
    	}
    	//获取下一位的电话号码数字
    	char telNum = dgs[index];
    	String telAlpha = map.get(telNum);
    	int len = telAlpha.length();
    	for(int i=0; i<len; i++) {
    		letterCombinations(index+1, dgs, str+ telAlpha.charAt(i));
    	}
    	return;
    }
}
