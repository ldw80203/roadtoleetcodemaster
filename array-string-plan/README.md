# array / string 補工具清單

依據 2026-08-06 診斷測（125 / 283 / 242 / 724 / 643）排的。

## 診斷結論

**你不缺膽量，缺工具。** 五題全部寫出能跑的 code，724 卡 50 分鐘沒逃，643 TLE 後自己去學滑動窗口。
但五題全是 O(n²)，因為工具箱裡目前只有「巢狀迴圈」和「insertion sort」。

四問只有 125 填了第 1 問，而且填的是對撞指標、寫出來卻是反轉字串比對——
**想到了，沒寫下來。** 跟樹題同一個病。

第 2 問（迴圈不變式）五題全空白。沒有不變式就只剩暴力掃描，所以每題都 O(n²)。

## 規則

1. 每題先填四問，**第 2 問不准跳過**。填不出來就先寫暴力版，然後回來填。
2. 每題檔頭有【限制】，那是這輪的重點。用被禁的方法過了不算過。
3. 25 分鐘上限。時間到貼給我。
4. 寫完的 code **存回檔案**，別只留在 LeetCode 網頁上。
5. 我只驗收不教。要提示自己說第幾級。我越級你就喊越級。

## 輪 1：用對的工具重寫診斷測那五題

同樣的題目，這次不准用暴力。目的是讓你親眼看到「同一題，工具不同差多少」。

- [ ] 1. 344 Reverse String —— 先做這題。它是 125 的骨架，最小的對撞指標練習
- [ ] 2. 125 Valid Palindrome —— 限制：O(1) 空間，不准開新字串
- [ ] 3. 283 Move Zeroes —— 限制：不准排序
- [ ] 4. 242 Valid Anagram —— 限制：不准排序，用 int[26]
- [ ] 5. 724 Find Pivot Index —— 限制：只准一層迴圈
- [ ] 6. 643 Maximum Average Subarray I —— 不看舊解答，自己重寫滑窗

## 輪 2：雙指標打穩

- [ ] 7. 977 Squares of a Sorted Array —— 限制：不准 Arrays.sort，要 O(n)
- [ ] 8. 167 Two Sum II —— 限制：不准 HashMap，用對撞指標
- [ ] 9. 88 Merge Sorted Array（重做）—— 限制：從後往前填
- [ ] 10. 26 Remove Duplicates（重做）—— 快慢指標

## 輪 3 之後（做到再產生檔案）

- 計數 / HashMap：383 Ransom Note、387 First Unique Character、349 Intersection、1 Two Sum（用 HashMap 重寫）
- 前綴和：1480 Running Sum、303 Range Sum Query、560 Subarray Sum Equals K（medium，進階）
- 滑動窗口：219 Contains Duplicate II、3 Longest Substring（重做）、209 Minimum Size Subarray Sum
- 字串 API：14 Longest Common Prefix（重做）、28 Find the Index of First Occurrence（重做）、151 Reverse Words

## Java 要補的東西（診斷測暴露出來的）

| 東西 | 為什麼 |
|---|---|
| `s1.equals(s2)` vs `s1 == s2` | 125 踩到了。`==` 比的是位址不是內容 |
| 迴圈裡的 `s += c` 是 O(n²) | 每次都建新字串。要累積字串一律用 `StringBuilder` |
| `Arrays.sort(arr)` | 242 你手刻 insertion sort。真的需要排序時用內建的，O(n log n) |
| `Arrays.equals(a, b)` | 你已經會了，記著 |
| `Character.isLetterOrDigit(c)` / `toLowerCase(c)` | 125 用得到，處理 char 不用先轉字串 |
| `int[26]` 當計數表 | `arr[c - 'a']++`。只含小寫字母時比 HashMap 快也簡單 |

## 進度

| 日期 | 題號 | 花多久 | 等級 | 卡點 |
|---|---|---|---|---|
|  |  |  |  |  |
