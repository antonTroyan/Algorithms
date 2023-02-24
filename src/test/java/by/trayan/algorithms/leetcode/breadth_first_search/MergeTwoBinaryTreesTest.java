package by.trayan.algorithms.leetcode.breadth_first_search;

import by.trayan.algorithms.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class MergeTwoBinaryTreesTest {

    @Test
    void mergeTrees() {
        final TreeNode treeNode1 = new TreeNode(1, new TreeNode(3, new TreeNode(5, null, null), null), new TreeNode(2));
        final TreeNode treeNode2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4, null, null)), new TreeNode(3, null, new TreeNode(7)));

        final TreeNode expectedResult = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)));

        Assert.isTrue(identicalTrees(MergeTwoBinaryTrees.mergeTrees(treeNode1, treeNode2), expectedResult), "");
    }

    private boolean identicalTrees(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;

        if (a != null && b != null)
            return (a.val == b.val
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));

        return false;
    }
}