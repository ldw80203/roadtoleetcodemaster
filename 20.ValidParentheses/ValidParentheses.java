/*題目要我完成什麼：給定一個s字串，字串包含'(' ')' '{' '}' '[' ']'，製作一個程式來判斷括號是否有遵循規則的閉合順序。如"()"應輸出true""({[]})"也是true，"(}"應輸出false
輸入：1.s = "()"2.s = "()[]{}" 3.s = "(]" 4.s = "([])" 5.s = "([)]"
輸出：1.true 2.true 3.false 4.true 5.false
限制：1 <= s.length <= 104，s consists of parentheses only '()[]{}'.
// 手算流程：外層迴圈從字串第0個字元開始，內層則從第1個字元開始，從左比對到右。先用switch判斷外層迴圈是甚麼字元所以會有3種case({[，然後針對每個case找出右邊放甚麼字元一定是錯的，用if判斷，錯了直接回傳false
example s = "()[]{}"，i = 0 j = 1,s.charAt(i) = '(',進入到case'('，'('下一個字元只要接] or }就不合法，此案例s.charAt(j)=')'，所以合法，而'('碰到')'就是一個完整括號，所以i應該直接往下一個括號移動需要跳過i=1,所以會有else if(s.charAt(j) == ')'){i+=2}，依序去把每個case寫出來
最簡單解法：
需要記住的資料：
可能的邊界：
迴圈中每個變數的責任：
時間複雜度：
空間複雜度： */
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(')');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else{
                if (stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
     public static void main(String[] args) {
        System.out.println(isValid("[]"));
     }
}
    

