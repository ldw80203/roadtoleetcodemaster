# Java 基礎易錯點

## char 和 String

`char` 是單一字元：

```java
char c = 'A';
```

`String` 是字串：

```java
String s = "A";
```

注意：

```java
char c = ''; // 錯，char 不能是空的
```

## charAt

字串不能用 `s[i]`。

Java 字串取字元要用：

```java
s.charAt(i)
```

最後合法 index 是：

```text
s.length() - 1
```

所以如果要看 `i + 1`，一定要先確認：

```java
i + 1 < s.length()
```

## 字元轉數字

二進位字串或數字字元要轉成 int：

```java
int digit = s.charAt(i) - '0';
```

例子：

```text
'1' - '0' = 1
'0' - '0' = 0
```

## StringBuilder

如果在迴圈中一直組字串，不要一直用：

```java
result += value;
```

比較適合用：

```java
StringBuilder sb = new StringBuilder();
sb.append(value);
return sb.toString();
```

如果是從右往左算，最後可能需要：

```java
return sb.reverse().toString();
```

## int overflow

`int` 最大值是：

```text
2147483647
```

像 `mid * mid` 可能 overflow。

在 Sqrt(x) 題中，避免：

```java
mid * mid <= x
```

可以改想：

```java
mid <= x / mid
```
