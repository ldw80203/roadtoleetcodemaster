# array / string 診斷測（5 題）

日期：2026-08-06

## 這是測驗，不是教學

規則：

1. **每題 25 分鐘上限。** 時間到就停，不管寫完沒有，貼給我。
2. **不准問我提示。** 卡住就寫爛版本，暴力解也算數（O(n^2) 沒關係，先寫出來）。
3. **可以查 Java 語法**（`charAt`、`StringBuilder`、`Character.isLetterOrDigit`…），不算作弊。
4. 每題開頭的四問要填。填不出來本身就是診斷結果，直接寫「填不出來」。
5. 五題做完我再排清單。**做完之前不要問我怎麼解。**

## 四問（取代樹題的三格）

樹題靠遞迴，array/string 靠迴圈，所以框架不一樣：

| | 問什麼 | 為什麼重要 |
|---|---|---|
| 1 | 我開了哪些變數／指標，各代表什麼 | 講不清楚代表你還沒想好 |
| 2 | 迴圈不變式：每輪開始時什麼一定成立 | 這是 array 題的「第 2 格」，最關鍵 |
| 3 | 迴圈條件與邊界：`<` 還是 `<=`、從哪到哪 | off-by-one 都死在這 |
| 4 | 迴圈結束時答案在哪個變數 | 對應你在樹題犯的「回傳值 ≠ 答案」 |

## 題目

- [ ] 1. 125 Valid Palindrome — 對撞雙指標（字串）
- [ ] 2. 283 Move Zeroes — 快慢雙指標、原地修改（陣列）
- [ ] 3. 242 Valid Anagram — 計數（字串）
- [ ] 4. 724 Find Pivot Index — 前綴和（陣列）
- [ ] 5. 643 Maximum Average Subarray I — 固定長度滑動窗口（陣列）

## 結果

| 題 | 花多久 | 有沒有自己解出來 | 卡在哪 |
|---|---|---|---|
| 125 |20分|有|上網找了如何只保留數字跟字母的語法，還有回傳兩個字串s1==s2出現錯誤，要用string.equals判斷字串是否相等|
| 283 |17|有|用insertion sort排序，不過小的放後面(錯誤版本，題目要求0往後但保持原本數字的順序所以用insertion順序會亂)
解法：把insertion做改變，本來判斷式是nums[j]>temp改成nums[j] == 0|
| 242 | 25分|有 | 解法：把字串轉成char陣列，再把char陣列轉成unicode的int陣列在用insertion sort排列，最後用Arrays.equals方法判斷兩個int陣列是否相等|
| 724 | 50分|有|原本是用巢式迴圈判斷兩邊是否加起來相等總共三個變數最外層的x = 0，代表目前的index，i = -1，代表左邊的值相加迴圈index 跟 j = x +1代表右邊的for迴圈相加index，不過會出現左邊的值要從x= 2才開始相加，所以改成for(int i = x - 1;i>= 0;i --，然後不是巢式迴圈，直接兩個平行迴圈相加比較最後回傳是否相等，while結束都不相等就回傳-1|
| 643 |1h24m|NO| 卡在時間複雜度需要O(n)，目前是O(n^2)會TLT,bn. Learn new algorithm (sliding window), sliding window can reduce the time complexcity from O(n^2) to O(n)|
