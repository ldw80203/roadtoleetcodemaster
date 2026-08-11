/*
變體題：Roman To Integer With Lowercase

你做過原題：13. Roman to Integer

題目：
給你一個羅馬數字字串 s，請回傳它代表的整數。
這次 s 可能包含大寫或小寫字母。

規則：
1. 'I' 和 'i' 都代表 1。
2. 'V' 和 'v' 都代表 5。
3. 其餘 Roman 字母也一樣大小寫皆可。
4. 你可以假設輸入一定是合法 Roman numeral。

範例：
s = "MCMXCIV"
return 1994

s = "mcmxciv"
return 1994

s = "Iv"
return 4

練習重點：
- char 和 String 差異
- charAt 邊界
- 大小寫轉換
- 當右邊數字比較大時要相減
*/
class Review13RomanLowercase {
    public int romanToInt(String s) {
        String z = s.toUpperCase();
        int sum = 0;

        for(int i = 0;i < z.length();i++){
            switch(z.charAt(i)){
                case 'M':
                    sum += 1000;
                case 'C':
                    if(z.charAt(i+1) == 'D'){

                    }
            }
        }
    }
}
