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
            left = dfs(arr,i*2+1,ans)
            right = dfs(arr,i*2+2,ans)
            ans = max(ans, left + right)
            return max(left, right) + 1
def diameterOfBinaryTree(arr,ans):
    ans = dfs(arr,0,ans)
    return ans
if __name__ == '__main__':
    arr = list(int(i) for i in input().split(" "))
    print(diameterOfBinaryTree(arr,ans))
```





