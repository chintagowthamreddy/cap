class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        l=[]
        def trav(root,s):
            if root==None :
                return 
            s+=str(root.val)+'->'
            if root.left==None and root.right==None:
                l.append(s.rstrip('->'))
                return l
            trav(root.left,s)
            trav(root.right,s)
        trav(root,'')
        return l
