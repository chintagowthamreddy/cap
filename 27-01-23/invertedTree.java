class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        res = [root]
        while res:
            node = res.pop()
            if node:
                node.left, node.right = node.right, node.left
                res += node.left, node.right
        return root
