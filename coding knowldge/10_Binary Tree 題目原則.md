# Binary Tree 題目原則

## 先不要急著寫 code

看到樹題，先做三件事：

1. 畫出小樹。
2. 用人腦手算一次。
3. 填五格模板。

不要一看到 `TreeNode` 就直接寫遞迴。先確認每個節點要做什麼。

## 五格模板

每題先填：

```text
這題的原問題是：
左子樹的子問題是：
右子樹的子問題是：
目前節點要做什麼：
停止條件是：
```

如果左子樹、右子樹的子問題跟原問題很像，只是樹變小，通常可以考慮遞迴。

## 樹題的遞迴直覺

遞迴不是硬背「呼叫自己」。真正的思考是：

```text
這個問題能不能拆成同樣問題，但範圍變小？
```

例子：

```text
判斷兩棵樹是否一樣
= 目前節點一樣 + 左子樹一樣 + 右子樹一樣
```

```text
計算最大深度
= 左子樹深度 + 右子樹深度 + 自己這一層
```

## null 的原則

`null` 代表這條路沒有節點。

常見判斷：

```text
root == null
```

不同題目中，`null` 意義不同：

```text
Traversal 題：走到 null，直接 return
Depth 題：走到 null，深度是 0
Compare 題：兩邊都 null 才算一樣；只有一邊 null 就不一樣
```

## 目前節點 vs 子樹

```text
root       是目前節點
root.val   是目前節點的值
root.left  是左子樹
root.right 是右子樹
```

如果題目要回傳 `List<Integer>`，通常加的是：

```java
result.add(root.val);
```

不是：

```java
result.add(root);
```

## 什麼時候需要 helper

如果 LeetCode 給的方法參數不夠，就建立 helper。

例如 `isSymmetric(root)` 只有一個 `root`，但鏡像比較需要同時比較左邊和右邊，所以需要：

```text
isMirror(left, right)
```

原方法通常是入口，helper 才是真正遞迴。

## 常見樹題類型

### 1. Traversal 題

重點是順序。

中序：

```text
左子樹 → 自己 → 右子樹
```

先序：

```text
自己 → 左子樹 → 右子樹
```

後序：

```text
左子樹 → 右子樹 → 自己
```

### 2. Compare 題

重點是比較同一個位置或鏡像位置。

Same Tree：

```text
p.left  vs q.left
p.right vs q.right
```

Symmetric Tree：

```text
left.left  vs right.right
left.right vs right.left
```

### 3. Depth 題

重點是子樹回傳數字。每個節點要問：

```text
左邊深度是多少？
右邊深度是多少？
我要選哪邊？
自己這一層要不要加進去？
```

## 寫 code 前的檢查問題

```text
1. 這題回傳 boolean、int、List，還是 TreeNode？
2. null 時要回傳什麼？
3. 目前節點要處理 val，還是處理整個節點？
4. 左子樹和右子樹要怎麼合併？
5. LeetCode 給的方法參數夠不夠？需不需要 helper？
```

## 常見錯誤

1. 把 `root` 和 `root.val` 搞混。
2. 把 `null` 當成錯誤，而不是停止條件。
3. 忘記目前節點自己也算一層。
4. Same Tree 只比 traversal 結果，沒有比結構。
5. Symmetric Tree 寫成左對左、右對右，忘記鏡像要交叉比。
6. 在子樹深度先 `+1`，最後又 `+1`，導致重複計算。

## 一句話總結

樹題不要先想 code。先想：

```text
目前節點做什麼？
左子樹回傳什麼？
右子樹回傳什麼？
怎麼把三者合起來？
```
