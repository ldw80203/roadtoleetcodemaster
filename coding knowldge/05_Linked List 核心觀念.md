# Linked List 核心觀念

## head 不是陣列

LeetCode 顯示：

```text
head = [1,2,3]
```

只是人類好讀的顯示方式。

Java 實際收到的是：

```text
head -> 1 -> 2 -> 3 -> null
```

`head` 是第一個節點的入口，不是整個陣列。

## ListNode 裡有什麼

一個節點通常是：

```java
class ListNode {
    int val;
    ListNode next;
}
```

也就是：

```text
val：這個節點的值
next：下一個節點的位置
```

## current = head 是什麼意思

```java
ListNode current = head;
```

不是複製一條 linked list。

只是讓 `current` 和 `head` 一開始指向同一個節點。

```text
head
 |
 v
1 -> 2 -> 3
^
|
current
```

## 改 current 和改 current.next 的差別

```java
current = current.next;
```

只是讓 current 往後走。

```java
current.next = current.next.next;
```

是在改節點的連線，會影響從 head 看到的整條 list。

## 火車車廂比喻

每個節點像一節車廂：

```text
車廂上的數字 = val
掛到下一節的鉤子 = next
```

`current = current.next`：

```text
維修工走到下一節車廂
```

`current.next = current.next.next`：

```text
把目前車廂的掛鉤改接到下下節車廂
```

所以節點被跳過了。
