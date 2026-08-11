# Reverse Linked List

## 為什麼需要 reverse

Linked list 只能往 `next` 走，不能往回走。

如果題目需要從右邊往左處理，可以先把 list 反轉。

例子：

```text
原本：
1 -> 2 -> 3 -> null

反轉後：
3 -> 2 -> 1 -> null
```

## 三個指標

```text
prev：反轉後，current 應該接到誰
current：目前正在處理的節點
next：先保存原本下一個節點，避免改 next 後迷路
```

## 順序

```text
next = current.next
current.next = prev
prev = current
current = next
```

順序不能亂。

## 為什麼要先存 next

如果直接做：

```java
current.next = prev;
```

原本的下一個節點會失去入口。

所以要先：

```java
next = current.next;
```

## 最後回傳誰

當 `current == null` 時，`prev` 會指向反轉後的新 head。

所以最後：

```java
return prev;
```

不是回傳 `head`，也不是回傳 `current`。
