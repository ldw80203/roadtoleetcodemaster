# Dummy 與 Current 指標

## dummy 是什麼

`dummy` 是假的頭節點，用來處理「答案頭可能改變」的情況。

常見初始化：

```java
ListNode dummy = new ListNode(0);
ListNode current = dummy;
```

分工：

```text
dummy：記住答案入口
current：負責往後接節點或修改 next
```

最後通常回傳：

```java
return dummy.next;
```

不是：

```java
return dummy;
```

因為 dummy 的 `0` 是假的。

## 什麼時候需要 dummy

當原本的 head 可能被刪掉時，適合用 dummy。

例子：

```text
head = [6,6,1], val = 6
```

刪完後新 head 是 `1`，原本 head 不能直接回傳。

## 刪節點的規則

如果要刪 `current.next`：

```java
current.next = current.next.next;
```

刪除時：

```text
current 不動
```

因為新的 `current.next` 還沒檢查。

保留時：

```java
current = current.next;
```

## 刪一整段重複值

用在 sorted linked list。

流程：

```text
1. 偵測 current.next 和 current.next.next 是否相同
2. 記住 repeat value
3. while current.next 還是 repeat，就一直跳過
```

重點：

```text
外層 if：確認有重複段
內層 while：刪掉整段重複值
```

內層 while 每次都要重新檢查 `current.next != null`，因為 `current.next` 會一直被改掉。
