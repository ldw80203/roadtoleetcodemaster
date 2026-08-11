/*
變體題：Minimum Add To Make Parentheses Valid

你做過原題：20. Valid Parentheses

題目：
給你一個只包含 '(' 和 ')' 的字串 s。
請回傳最少需要加入幾個括號，才能讓整個字串變成合法括號。

範例：
s = "())"
return 1
說明：加一個 '(' 變成 "(())"

s = "((("
return 3
說明：需要補三個 ')'

s = "()"
return 0

練習重點：
- 用 counter 模擬還沒被配對的 '('
- 遇到 ')' 時，如果沒有 '(' 可以配，就需要補一個 '('
- 最後剩下的 '(' 都需要補 ')'
*/
class Review20MinAddParentheses {
    public int minAddToMakeValid(String s) {
        return 0;
    }
}
