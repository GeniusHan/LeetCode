package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC109 {
	
	//设置两个指针分别以步长1和2遍历链表
    public TreeNode sortedListToBST(ListNode head) {
    	if(head==null) return null;
    	return sortedListToBST(head, null);
    }
    
    private TreeNode sortedListToBST(ListNode head, ListNode tail) {
    	if(head==tail) return null;
    	ListNode slow = head;
    	ListNode quick = head;
    	while(quick!=tail && quick.next!=tail) {
    		slow = slow.next;
    		quick = quick.next.next;
    	}
    	TreeNode root = new TreeNode(slow.val);
       	root.left = sortedListToBST(head, slow);
    	root.right = sortedListToBST(slow.next, tail);
    	return root;
    }
}

/***********************old************************ */

//public class LC109 {
//	
//	private Map<Integer, Integer> map;
//	
//    public TreeNode sortedListToBST(ListNode head) {
//    	if(head==null) return null;
//    	int lnLength = putListNodeValIntoMap(head);
//    	return sortedListToBST(0, lnLength-1);
//    }
//    
//    private TreeNode sortedListToBST(int start, int end) {
//    	if(start>end) return null;
//    	int mid = start + (end-start+1)/2;
//    	TreeNode root = new TreeNode(map.get(mid));
//    	root.left = sortedListToBST(start,mid-1);
//    	root.right = sortedListToBST(mid+1, end);
//    	return root;
//    }
//    
//    private int putListNodeValIntoMap(ListNode head) {
//    	map = new HashMap<Integer, Integer>();
//    	int position = 0;
//    	while(head!=null) {
//    		map.put(position , head.val);
//    		head = head.next;
//    		position++;
//    	}
//    	//返回链表长度
//    	return position;
//    }
//}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
