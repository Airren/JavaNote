# Java Note
<div align="left">
Created By Airren
</div>
<br>


## [Java Note]

[Java 虚拟机](JavaNote/Java虚拟机.md)


## [慕课网教程]
[Google面试官亲授 升级Java面试](imooc/imooc_Google讲Java/0_Category.md)
[剑指Java面试-Offer直通车](imooc/imooc_剑指offer/0_Category.md)
[]()
[]()
[]()
[]()
[]()

```python
class BSTreeNode(object):
    def __init__(self, data):
        self.val = data
        self.leftChild = None
        self.rightChild = None
# 建立二叉树是以层序遍历方式输入，节点不存在时以 'None' 表示
def creatTree(nodeList):
    if nodeList[0] == -1:
        return None
    head = BSTreeNode(nodeList[0])
    Nodes = [head]
    j = 1
    for node in Nodes:
        if node != -1:
            node.leftChild = (BSTreeNode(nodeList[j]) if nodeList[j] != -1 else None)
            Nodes.append(node.leftChild)
            j += 1
            if j == len(nodeList):
                return head
            node.rightChild = (BSTreeNode(nodeList[j])if nodeList[j] != -1 else None)
            j += 1
            Nodes.append(node.rightChild)
            if j == len(nodeList):
                return head



class Solution(object):
    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.ans = 0
        def dfs(root):
            if not root:
                return 0
            left = dfs(root.leftChild)
            right = dfs(root.rightChild)
            self.ans = max(self.ans, left + right)
            return max(left, right) + 1
        dfs(root)
        return self.ans
if __name__ == '__main__':
    arr = list(int(i) for i in input().split(" "))
    root = creatTree(arr)
    s = Solution()
    print(s.diameterOfBinaryTree(root))
```





