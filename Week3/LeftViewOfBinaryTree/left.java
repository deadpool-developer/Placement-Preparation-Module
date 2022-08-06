package Week3.LeftViewOfBinaryTree;
import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class left {
    public List<Integer> lightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        leftView(root, result, 0);
        return result;
    }
    
    public void leftView(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        
        leftView(curr.left, result, currDepth + 1);
        leftView(curr.right, result, currDepth + 1);
        
        
    }
}