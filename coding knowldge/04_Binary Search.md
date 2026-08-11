# Binary Search

## 核心觀念

Binary Search 不是讓 `mid` 一格一格走。

真正要改的是邊界：

```text
left
right
```

每次看中間：

```java
int mid = left + (right - left) / 2;
```

不要只在 while 外面算一次 `mid`，每一輪都要重新算。

## 基本模板

```java
while (left <= right) {
    int mid = left + (right - left) / 2;

    if (nums[mid] == target) {
        return mid;
    } else if (nums[mid] < target) {
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}
```

## 為什麼不是 left = mid

因為 `mid` 已經檢查過。

如果不排除 `mid`，範圍可能不變，造成無限迴圈。

```text
往右找：left = mid + 1
往左找：right = mid - 1
```

## Search Insert Position

如果找不到 target，最後 `left` 會停在插入位置。

所以最後可以回傳：

```java
return left;
```

## Sqrt(x)

要找最大整數 `ans`，讓：

```text
ans * ans <= x
```

但 `mid * mid` 可能 overflow。

所以用：

```java
mid <= x / mid
```

遇到合法值時：

```text
先記錄 ans，再往右找更大的可能
```
