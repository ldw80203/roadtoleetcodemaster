/*
變體題：Palindrome Number Without String

你做過原題：9. Palindrome Number

題目：
給你一個整數 x，判斷它是不是回文數。
但這次限制：不要把 x 轉成 String。

規則：
1. 負數不是回文。
2. 0 是回文。
3. 不可以使用 String.valueOf、toString、charAt。

範例：
x = 121
return true

x = -121
return false

x = 123
return false

練習重點：
- 用 % 10 取得最後一位數
- 用 / 10 移除最後一位數
- 數字反轉
- 思考 overflow 風險
*/

class Review09PalindromeWithoutString {
    public boolean isPalindrome(int x) {
        if(x == 0){return true;}
        else if(x < 0 || (x%10 == 0 && x != 0)){return false;}
        int reversed = 0;
    
        while (x > reversed){
            reversed = reversed*10 + x%10; 
            x = x/10;
        }
        
        return reversed == x || reversed/10 == x;

    }
}
