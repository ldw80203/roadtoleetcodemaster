/*題目：Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
語言：Java
我的想法:把字串由左向右檢查，把例外狀況寫出來，剩下的都是正常狀況，再把所有符號代表值做加總
我的程式碼：
卡住的地方：if(s.charAt(i)=="M")
錯誤訊息：bad operand types for binary operator '=='
  first type:  char
  second type: String
希望獲得：提示 */
public class RomantoInteger {
    public static int romanToInt(String s){
        int sum = 0;

        for (int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            char b = '\0';
            if (i + 1<s.length()){
                b = s.charAt(i+1);
            }
            switch (a){
                case 'M':
                    sum += 1000;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'C':
                    if((b)=='M'){
                        sum += 900;
                        i+=1;
                        break;
                    }
                    else if((b)=='D'){
                        sum += 400;
                        i+=1;
                        break;
                    }
                    else{
                        sum += 100;
                        break;
                    }
                    
                case 'L':
                    sum += 50;
                    break;         
                case 'X':
                    if((b)=='L'){
                        sum += 40;
                        i+=1;
                        break;
                    }
                        
                    else if((b)=='C'){
                        sum += 90;
                        i+=1;
                        break;    
                    }
                    else{
                        sum += 10;
                        break;
                     }
                case 'V':
                    sum += 5;
                    break;
                case 'I':
                    if((b)=='V'){
                        sum += 4;
                        i+=1;
                    break;}
                    else if((b)=='X'){
                        sum += 9;
                        i+=1;
                    break;
                    }
                    else{
                        sum += 1;
                        break;
                    }

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = romanToInt("MCMXCIV");
        System.out.println(a);
    }

}
/*note:
Find the problem of boundary of varible i+1>s.length()
learn how to define a empty char variable with '/0', for instance char b = '/0', to avoid the if statement can't be read by the switch function. */