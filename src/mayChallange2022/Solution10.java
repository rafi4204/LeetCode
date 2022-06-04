package mayChallange2022;

import februaryChallange2021.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

class WordConcatenation {
    public static List<Integer> findWordConcatenation(String str, String[] words) {
        List<Integer> resultIndices = new ArrayList<Integer>();
        int k = words[0].length();
        int len = words.length * k;
        int i = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, 0);
        }
        for (int j = 0; j + k < str.length(); j++) {

            if (j + k < str.length() && map.containsKey(str.substring(j, j + k+1))) {
                map.put(str.substring(j, j + k+1), map.get(str.substring(j, j + k+1)) + 1);
            } else if (!map.containsKey(str.substring(j, j + k+1)) || map.get(str.substring(j, j + k+1)) != 0) {
                i+=3;
            }

        }
        return resultIndices;
    }
}