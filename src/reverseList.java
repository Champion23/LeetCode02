/**
 * @author 闫亮23
 * @version 1.0
 */
// 翻转 链表
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode pre=null;  // 定义 一个 前节点 为 NULL
        ListNode cur=head;   // 定义 cur 当前节点为 头结点
        ListNode temp=null;  // 用作 转换过度的 节点

        while(cur!=null){ // 转变 链表 方向
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;

    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }