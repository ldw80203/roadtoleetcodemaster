/* 題目：https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
語言：Java
我的想法：
我的程式碼：
卡住的地方：
錯誤訊息：
希望獲得：提示／除錯／完整解答*/
public class findtheindex {
    public int strStr(String haystack, String needle) {
        int i;
        if(needle.length()>haystack.length()){
            return -1;
        }
        for(i = 0;i <= haystack.length() - needle.length();i++){
            boolean match = true;
            for(int j = 0;j < needle.length();j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
            return i;
            }
        }
        return -1;
    }
}
