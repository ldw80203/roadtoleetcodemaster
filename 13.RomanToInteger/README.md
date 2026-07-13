# 13. Roman to Integer

- 題目：[Roman to Integer](https://leetcode.com/problems/roman-to-integer/description/)
- 語言：Java
- 狀態：成功提交
- 解法：由左至右檢查 Roman symbol，處理減法組合後累加數值。
- 時間複雜度：`O(n)`
- 空間複雜度：`O(1)`

## 學習紀錄

- `s.charAt(i)` 回傳 `char`，應與 `'M'` 比較；不能與 `"M"` 比較。
- `charAt(i + 1)` 讀取下一個字元前，必須確認 `i + 1 < s.length()`。
- 最後一個字元沒有下一個位置，否則會產生 `StringIndexOutOfBoundsException`。
- 本地測試只通過一組資料，可能剛好沒有碰到邊界錯誤；LeetCode 會測試更多案例。
- 區域變數若宣告在 `if` 區塊內，外部無法使用，需注意作用域。
- 減法組合包括 `IV`、`IX`、`XL`、`XC`、`CD`、`CM`。

## 錯誤排查

- `char` 與 `String` 型別不一致。
- `i + 1` 超過字串最後索引。
- VS Code 單一測資成功，不代表所有邊界測資都安全。
