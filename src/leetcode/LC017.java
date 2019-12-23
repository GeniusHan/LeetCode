package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
 * 电话号码的字母组合
 */
public class LC017 {
	
    public List<String> letterCombinations(String digits) {
    	Map<Character,String> map = new HashMap<Character,String>();
    	map.put('2', "abc");
    	map.put('3', "def");
    	map.put('4', "ghi");
    	map.put('5', "jkl");
    	map.put('6', "mno");
    	map.put('7', "pqrs");
    	map.put('8', "tuv");
    	map.put('9', "wxyz");
        char[] dgs = digits.toCharArray();
        List<String> list = new ArrayList<String>();
        for(char e : dgs) {
        	String tmp = "";
        	tmp = tmp + e;
        	String value = map.get(e);
        }
        
        //Queue<String> queue = new Queue<String>();
    }
}
