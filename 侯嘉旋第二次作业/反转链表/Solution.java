public class Solution {
    public static class LinkNode{
        int val;
        LinkNode next=null;
        public LinkNode(int n){
            this.val=n;
        }
    }

    public LinkNode getReverseLink(LinkNode headnode){
        LinkNode preNode=null;
        LinkNode curNode=headnode;
        LinkNode reverseHeadNode=null;

        while(curNode!=null){
            LinkNode nextNode=curNode.next;
            if(nextNode==null)
                reverseHeadNode=curNode;
            curNode.next=preNode;
            preNode=curNode;
            curNode=nextNode;
        }
        return reverseHeadNode;
    }

    public static void main(String[] args){
        Solution r=new Solution();
        LinkNode node1=new LinkNode(1);
        LinkNode node2=new LinkNode(2);
        LinkNode node3=new LinkNode(3);
        LinkNode node4=new LinkNode(4);
        LinkNode node5=new LinkNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        LinkNode node=r.getReverseLink(node1);
        System.out.println("头结点是"+node.val);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }


}