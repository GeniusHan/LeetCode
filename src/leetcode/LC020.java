package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
 * 
	给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
	
	有效字符串需满足：
	
	左括号必须用相同类型的右括号闭合。
	左括号必须以正确的顺序闭合。
	注意空字符串可被认为是有效字符串。
 */
public class LC020 {

	//利用栈先进后出的特点
    public boolean isValid(String s) {
    	/*
        if(s=="") return true;
    	//stack
        List<Character> list = new ArrayList<Character>();
        //enum
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        
        char[] cs = s.toCharArray();
        int length = cs.length;
        if(length%2!=0) return false;
        for(int i=0; i<length; i++) {
        	if(map.containsValue(cs[i])) {
        		list.add(cs[i]);
        	} else {
        		int index = list.size();
        		if(index==0) return false;
        		if(list.get(index-1).equals(map.get(cs[i]))) {
        			list.remove(index-1);
        		}else {
        			return false;
        		}
        	}
        }
        if(list.size()!=0) return false;
        return true;
        */
        Stack<Character> charStack = new Stack<Character>();
        char[] cs = s.toCharArray();
        for(char c : cs) {
        	if(charStack.size()==0) {
        		charStack.push(c);
        	}else if(isSym(charStack.peek(),c)) {
        		charStack.pop();
        	}else {
        		charStack.push(c);
        	}
        }
        return charStack.size()==0;
    }
    
    private boolean isSym(char c1, char c2) {
    	return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }
}
