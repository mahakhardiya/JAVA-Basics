package plus;

public class mergeLists { //O(m+n)
    static Node merge(Node l1, Node l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        Node ans = l1;
        while(l1 != null && l2 != null){
            Node temp = l1;
            while( l1 != null && l1.val <= l2.val){
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;
            Node t = l1;
            l1 = l2;
            l2 = t;
        }
        return ans;
    }

    class Node {
        int val;        // Data part
        Node next;       // Reference to the next node
    
        // Constructor
        Node(int val) {
            this.val = val;
            this.next = null;  // By default, next is null
        }
    }
}
