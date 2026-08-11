# public / private / static / class

> 在 LeetCode 上，這些東西你只需要懂 20%。以下就是那 20%。

---

## class 是什麼

**class = 設計圖，物件 = 照設計圖做出來的東西。**

```java
class TreeNode {      // 設計圖：一個節點長什麼樣
    int val;
    TreeNode left;
    TreeNode right;
}

TreeNode a = new TreeNode(3);   // 照設計圖做出一個實際的節點
```

`new` 就是「照設計圖做一個出來」。

`class Solution` 也一樣 —— LeetCode 的評測系統會幫你 `new Solution()`，然後呼叫你的方法。

---

## public / private

**只有一個問題：誰可以呼叫它。**

| | 誰能呼叫 |
|---|---|
| `public` | 誰都可以，包括 class 外面 |
| `private` | 只有這個 class 裡面 |

```java
class Solution {
    public int minDepth(TreeNode root) { ... }   // 評測系統從外面呼叫 → 必須 public
    private int height(TreeNode node) { ... }    // 只有我自己用 → private
}
```

**在 LeetCode 上，helper 方法寫 `public` 或 `private` 都會過。**

`private` 只是在表達「這是我內部用的，不是給外面的」。是慣例，不是需求。

會卡住的只有一件事：**主函式必須 `public`**，因為評測系統從外面呼叫它。

---

## static

**沒有 static = 屬於某個物件。有 static = 屬於 class 本身。**

```java
class Solution {
    int ans = 0;                      // 每個 new 出來的 Solution 各有一份
    static int count = 0;             // 全部共用一份，不用 new 就存在
}
```

**LeetCode 上你基本不需要 static**，因為系統會幫你 `new Solution()`。

**唯一會遇到的坑：**

> `static` 方法不能呼叫非 `static` 的方法。

```java
class Solution {
    public static int a() {
        return b();      // ❌ 編譯錯誤
    }
    private int b() { return 1; }
}
```

原因：`static` 方法不屬於任何物件，而 `b()` 需要一個物件才能執行。

**規則：要嘛全部加 static，要嘛全部不加。混用就會炸。**

在 LeetCode 上，最省事的是**全部都不加 static**。

---

## 成員變數（543 會用到）

寫在方法**外面**、class **裡面**的變數，整個 class 共用：

```java
class Solution {
    int ans = 0;                    // ← 成員變數

    public int someProblem(TreeNode root) {
        helper(root);               // 遞迴過程中偷偷更新 ans
        return ans;                 // 最後回傳它
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;
        int l = helper(node.left);
        int r = helper(node.right);

        ans = Math.max(ans, l + r);  // ← 更新答案

        return Math.max(l, r) + 1;   // ← 回傳的是別的東西
    }
}
```

**這就是「回傳值 ≠ 答案」的實作方式。**

`helper` 回傳高度，但真正的答案存在 `ans` 裡。兩個是不同的東西。

一大票樹的 medium 都是這個結構。543 是第一題。

---

## 總結：LeetCode 上的預設寫法

```java
class Solution {
    int ans;                                      // 需要跨遞迴累積答案時才加

    public 回傳型別 主函式(參數) { ... }           // 必須 public

    private 回傳型別 helper(參數) { ... }          // private，不加 static
}
```

照這個寫，99% 的題目不會遇到宣告問題。
