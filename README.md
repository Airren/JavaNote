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
ans = 0
def dfs(arr,i):
    global ans
    if i>=len(arr):
        return 0
    else:
        if  arr[i]==-1:
            return 0
        else:
            left = dfs(arr,i*2+1)
            right = dfs(arr,i*2+2)
            ans = max(ans, left + right)
            return max(left, right) + 1
def diameterOfBinaryTree(arr):
    global ans
    ans = dfs(arr,0)
    return ans
if __name__ == '__main__':
    arr = list(int(i) for i in input().split(" "))
    print(diameterOfBinaryTree(arr))
```
--------------
```python 


class Solution(object):
    def diameterOfBinaryTree(self, arr,root):
        self.ans = 0
        def dfs(arr,root):
            if root >= len(arr) :
                return 0
            if  arr[root]== -1:
                return 0

            left = dfs(arr, root*2)

            right = dfs(arr, root*2+1)

            self.ans = max(self.ans, left + right)

            return max(left, right) + 1

        dfs(arr,root)
        return self.ans
if __name__ == '__main__':
    arr = list(int(i) for i in input().split(" "))
    s = Solution()
    root = 1;
    arr = [0]+arr

    print(s.diameterOfBinaryTree(arr, root))



    # 0 1 2 3 4 -1 -1 -1
````




