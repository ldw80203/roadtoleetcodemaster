# Carry 加法題

## 核心觀念

只要是加法題，通常要有：

```text
sum：本輪總和
carry：進位
```

每一位：

```java
int sum = carry;
```

加完後：

```java
current digit = sum % base;
carry = sum / base;
```

十進位：

```text
base = 10
```

二進位：

```text
base = 2
```

## Add Two Numbers

LeetCode 2 的 list 是反向儲存。

```text
[2,4,3] 代表 342
[5,6,4] 代表 465
```

所以可以從 head 開始加。

常用條件：

```java
while (l1 != null || l2 != null || carry != 0)
```

讀 `l1.val` 前要先檢查：

```java
if (l1 != null)
```

讀 `l2.val` 前也要檢查：

```java
if (l2 != null)
```

## 建立答案 list

需要：

```java
ListNode dummy = new ListNode(0);
ListNode current = dummy;
```

每輪建立新節點：

```java
current.next = new ListNode(sum % 10);
current = current.next;
```

不能只做：

```java
current.val = sum;
```

因為那只是改目前節點，沒有長出下一個節點。

## Add Binary

從右往左加。

條件：

```java
while (i >= 0 || j >= 0 || carry != 0)
```

結果通常用 `StringBuilder`：

```java
sb.append(sum % 2);
return sb.reverse().toString();
```

## Plus One

如果從尾巴開始，遇到不是 9 的位數：

```text
+ 後就可以直接 return
```

如果全部是 9，才需要建立長度 +1 的新陣列。
