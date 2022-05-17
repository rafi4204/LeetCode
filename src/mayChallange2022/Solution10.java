package mayChallange2022;

import februaryChallange2021.TreeNode;

class Solution10 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return traverse(cloned, target);
    }

    private TreeNode traverse(TreeNode node, TreeNode target) {
        if (node == null) return null;
        if (node.getVal() == target.getVal()) return node;
        TreeNode temp1 = traverse(node.getLeft(), target);
        TreeNode temp2 = traverse(node.getRight(), target);
        if (temp1 == null) return temp2;
        else
            return temp1;
    }
}