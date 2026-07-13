/*題目：https://leetcode.com/problems/palindrome-number/description/
語言：Java
我的想法：先判斷數字的位數，用兩個迴圈同時比對，第一個迴圈從頭開始，第二個從尾開始，如果相等就繼續比對，只要一個不相等就直接回傳false。
我的程式碼：
卡住的地方：不知道該怎麼判斷位數
錯誤訊息：
希望獲得：提示／除錯／完整解答 */
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        int i;
        for (i = 0;i<a.length()/2;i++){
            if(a.charAt(i) != a.charAt(a.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    
}
/*今日學習String.valueOf(x)函數，將括號內整數轉成字串。charAt()，字串位置的符號，字串長度為0到-1，用法為sting.charAt(n)可以找到位置n的符號 */