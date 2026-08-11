/*
變體題：Find The Index Of The Last Occurrence In A String

你做過原題：28. Find the Index of the First Occurrence in a String

題目：
給你兩個字串 haystack 和 needle。
請回傳 needle 在 haystack 中「最後一次」出現的起始 index。
如果找不到，回傳 -1。

範例：
haystack = "sadbutsad", needle = "sad"
return 6

haystack = "leetcode", needle = "leeto"
return -1

haystack = "aaaaa", needle = "aa"
return 3

練習重點：
- i 的合法範圍
- 從右往左找，找到就可以 return
- 內層 j 比較 needle 每個字元
- charAt(i + j) 的邊界
*/
class Review28LastOccurrence {
    public int strStrLast(String haystack, String needle) {
        return -1;
    }
}
