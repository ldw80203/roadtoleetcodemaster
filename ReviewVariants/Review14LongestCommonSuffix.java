/*
變體題：Longest Common Suffix

你做過原題：14. Longest Common Prefix

題目：
給你一個字串陣列 strs，請找出所有字串共同的「最長後綴」。
後綴是指字串結尾的連續字元。

規則：
1. 如果沒有共同後綴，回傳空字串 ""。
2. strs 至少有一個字串。
3. 不要先把每個字串反轉成新字串。

範例：
strs = ["running", "walking", "king"]
return "ing"

strs = ["flower", "tower", "power"]
return "ower"

strs = ["dog", "racecar", "car"]
return ""

練習重點：
- 以 strs[0] 當基準
- 從字串尾巴往前比較
- 避免短字串 index 超出範圍
*/
class Review14LongestCommonSuffix {
    public String longestCommonSuffix(String[] strs) {
        return "";
    }
}
