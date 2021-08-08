package linked;


import java.util.HashSet;
import java.util.Stack;
public class LinkedListDemo {
    LinkNode head;

    class LinkNode{
        int val;
        LinkNode next;
        public LinkNode(int val){
            this.val = val;
        }
    }
    public LinkNode removeElements(LinkNode head,int val){
        while(head!=null){
            if(head.val!=val){
                break;
            }
            head = head.next;
        }
        LinkNode cur = head;
        LinkNode pre = head;
        while(cur!=null){
            if(cur.val==val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
    public LinkNode removeElementsByStack(LinkNode head,int val){
        Stack<LinkNode> stack = new Stack<LinkNode>();
        while(head!=null){
            if(head.val!=val){
                stack.push(head);
            }
            head = head.next;
        }
        while(!stack.isEmpty()){
            stack.peek().next = head;
            head = stack.pop();
        }
        return head;
    }

    public LinkNode removeRepeat(LinkNode head){
        if(head==null){
            return null;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(head.val);
        LinkNode pre = head;
        LinkNode cur = head.next;
        while(cur!=null){
            if(set.contains(cur.val)){
                pre.next = cur.next;
            }else{
                set.add(cur.val);
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public void display(LinkNode head){
        System.out.print("list:");
        LinkNode cur = head;
        while(cur!=null){
            System.out.print(cur.val+"->");
            cur = cur.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insert(int val){
        if(head==null){
            head = new LinkNode(val);
        }else{
            LinkNode cur = head;
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = new LinkNode(val);
        }
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.insert(1);
        list.insert(2);
        list.insert(6);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.display(list.head);
        LinkNode head = list.removeElements(list.head, 6);
        list.display(head);
    }

}
