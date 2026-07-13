# 9. Palindrome Number

- 題目：[Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)
- 語言：Java
- 狀態：完成實作
- 解法：將整數轉成字串，比較左右對稱字元。
- 時間複雜度：`O(n)`
- 空間複雜度：`O(n)`

## 學習紀錄

- 使用 `String.valueOf(x)` 將整數轉成字串。
- `String` 不是陣列，使用 `charAt(i)` 取得字元。
- 使用 `length()` 取得字串長度。
- 只需比較到字串長度的一半。
- 比較位置：`i` 與 `a.length() - 1 - i`。
- 發現全部比較完成後，必須補上 `return true`。

## Java 觀念

```java
char c = 'M';
String s = "M";
```

- `char` 儲存單一字元，使用單引號。
- `String` 儲存字串，使用雙引號。
- `char` 比較可使用 `==`；`String` 內容比較使用 `.equals()`。
