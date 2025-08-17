// JavaProblems/ZigzagLevelOrder.java
import java.util.*;

class TreeNode6 {
    int val; TreeNode6 left,right;
    TreeNode6(int val){ this.val=val; }
}

public class ZigzagLevelOrder {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode6 root){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode6> q=new LinkedList<>();
        q.offer(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode6 node=q.poll();
                if(leftToRight) level.add(node.val);
                else level.add(0,node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            res.add(level);
            leftToRight=!leftToRight;
        }
        return res;
    }

    public static void main(String[] args){
        TreeNode6 root=new TreeNode6(3);
        root.left=new TreeNode6(9);
        root.right=new TreeNode6(20);
        root.right.left=new TreeNode6(15);
        root.right.right=new TreeNode6(7);
        System.out.println(zigzagLevelOrder(root));
    }
}
