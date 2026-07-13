/*題目：Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
語言：Java
我的想法：用兩個for迴圈逐一抓string[n]中的每個char並比對，第一個迴圈表示第i個陣列字串strs[i]第二個表示strs[i]中的每個char，由左開始到右
可能需要兩個巢狀迴圈
我的程式碼：
卡住的地方：for迴圈不知道該怎麼包，可以讓if判斷a是否與b相等。重複比對時該怎麼不將重複的部分再次放入字串中，該如何比較不同的前墜
錯誤訊息：
希望獲得：提示*/
class Solution {
    public static String longestCommonPrefix(String[] strs) {
        char a = '\0';
        char b ='\0';
        String prefix = "";
        for(int i = 0;i<strs[0].length();i++){
            for (int j = 1;j < strs.length;j++){
                char s = prefix.charAt(i);
                a = strs[0].charAt(i);
                b = strs[j].charAt(i);
                if(a == b && prefix.charAt(i) != a){
                    prefix += a;
                }
                else if(a != b && prefix.indexOf(s) != -1){
                    s = '\0';
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String a = longestCommonPrefix(strs);
        System.out.println(a);
    }
}