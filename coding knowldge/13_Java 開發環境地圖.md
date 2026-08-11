# Java 開發環境地圖

寫給「會寫 code 但沒裝過環境」的自己。遇到不認識的名詞回來查。

---

## 一、從原始碼到跑起來

```
Main.java  ──javac──▶  Main.class  ──java──▶  程式在跑
（你寫的字）   編譯器      （bytecode）   JVM
```

**為什麼要編譯？** 電腦看不懂 `public class`，它只看得懂機器碼。
Java 特別的地方是它不直接編成機器碼，而是編成 **bytecode**（中間格式），
再由各平台的 JVM 去執行。所以同一個 `.class` 在 Windows、Mac、Linux 都能跑——
這就是「Write Once, Run Anywhere」的意思。

你在 VS Code 按執行的時候，背後就是這兩步。IDE 幫你按了，所以感覺不到。

### 手動做一次（建議真的做一次，五分鐘）

```bash
javac Main.java     # 產生 Main.class
java Main           # 執行（注意：沒有 .class 副檔名）
```

做過一次，之後看到「編譯錯誤」和「執行錯誤」你就分得出來是哪一步壞了。

---

## 二、名詞對照表

### 語言與執行環境

| 名詞           | 是什麼                      | 白話                             |
| ------------ | ------------------------ | ------------------------------ |
| **JVM**      | Java Virtual Machine     | 真正執行 bytecode 的引擎              |
| **JRE**      | Java Runtime Environment | JVM + 標準函式庫。**只能跑，不能編譯**       |
| **JDK**      | Java Development Kit     | JRE + `javac` + 開發工具。**你要裝這個** |
| **bytecode** | `.class` 檔的內容            | 介於原始碼和機器碼之間的中間格式               |
| **LTS**      | Long Term Support        | 長期維護的版本。目前選 **JDK 21**         |

> 只有 `java` 沒有 `javac` = 你裝到 JRE 了，要重裝 JDK。

### 建置與依賴

| 名詞 | 是什麼 | 白話 |
|---|---|---|
| **Maven** | 建置工具 + 依賴管理 | 幫你下載函式庫、編譯、打包，並規定專案長什麼樣 |
| **pom.xml** | Maven 的設定檔 | 專案身分證：名字、版本、用到哪些函式庫 |
| **dependency** | 依賴 | 你用到的別人寫的函式庫 |
| **傳遞性依賴** | transitive dependency | A 需要 B，B 需要 C → Maven 自動連 C 一起抓 |
| **jar** | Java ARchive | 打包好的 Java 程式，本質是壓縮檔 |
| **mvnw** | Maven Wrapper | 專案自帶的 Maven，不用先裝也能跑 |
| **~/.m2** | 本機倉庫 | Maven 下載的東西全放這，第二次就不用重抓 |
| **Gradle** | 另一個建置工具 | Maven 的競爭對手，Android 常用。先不用管 |

### Spring 世界

| 名詞                         | 是什麼             | 白話                                |
| -------------------------- | --------------- | --------------------------------- |
| **Spring**                 | Java 應用框架       | 核心是「幫你管理物件怎麼被建立、怎麼串在一起」           |
| **Spring Boot**            | 預設都幫你設好的 Spring | **內建網頁伺服器**，`java -jar` 就變成一台網站主機 |
| **Bean**                   | 被 Spring 管理的物件  | 你不用自己 `new`，Spring 建好放著等你用        |
| **DI / IoC**               | 依賴注入 / 控制反轉     | 「不要自己 new，讓框架把東西送進來」              |
| **Tomcat**                 | 網頁伺服器           | 負責聽 HTTP 請求。Spring Boot 內建，你不用另外裝 |
| **Controller**             | 處理網址的類別         | 一個方法對應一個網址                        |
| **Service**                | 商業邏輯層           | 真正做事的地方                           |
| **Repository**             | 資料存取層           | 跟資料庫講話的地方                         |
| **Thymeleaf**              | 樣板引擎            | 讓伺服器把資料塞進 HTML 再送給瀏覽器             |
| **JPA / Hibernate**        | ORM             | 讓你用 Java 物件操作資料庫，不用手寫 SQL         |
| **Entity**                 | 對應資料表的類別        | 一個 class = 一張表，一個物件 = 一列資料        |
| **H2**                     | 記憶體資料庫          | 開發時用，重開就清空，不用安裝                   |
| **PostgreSQL**             | 正式資料庫           | 上線用，資料留得住                         |
| **application.properties** | Spring Boot 設定檔 | 資料庫位址、埠號之類的都寫這                    |

### 作業系統層

| 名詞 | 是什麼 | 白話 |
|---|---|---|
| **環境變數** | 系統層級的設定值 | 所有程式都讀得到的全域變數 |
| **PATH** | 一串資料夾路徑 | 你打 `mvn`，系統照 PATH 一個一個資料夾找 |
| **JAVA_HOME** | 指向 JDK 資料夾 | 很多工具靠它找到 Java |
| **MAVEN_HOME** | 指向 Maven 資料夾 | 同上 |

> 改完環境變數**一定要開新的終端機**。舊視窗讀的是舊的。

---

## 三、完整的鏈條（Spring Boot 專案）

```
1. 你寫 .java 和 pom.xml
        ↓
2. Maven 讀 pom.xml，去中央倉庫下載依賴，存到 ~/.m2
        ↓
3. Maven 呼叫 javac 編譯，產生 .class
        ↓
4. Maven 打包成一個 .jar（含 Tomcat 和所有依賴）
        ↓
5. java -jar app.jar
        ↓
6. Spring Boot 啟動，掃描你的 class，建立 Bean
        ↓
7. 內嵌的 Tomcat 開始聽 8080 埠
        ↓
8. 瀏覽器打 localhost:8080/hello
        ↓
9. Tomcat 收到 → Spring 找到對應的 Controller 方法 → 執行 → 回傳字串
        ↓
10. 你在畫面上看到「哈囉」
```

**`mvn spring-boot:run` 一個指令做完 2～7 步。**

---

## 四、常見錯誤對照

| 症狀 | 通常是什麼原因 |
|---|---|
| `'mvn' 不是內部或外部命令` | PATH 沒設好，或沒開新終端機 |
| `javac` 找不到但 `java` 可以 | 裝成 JRE 了，要裝 JDK |
| `JAVA_HOME is not defined` | 沒設 JAVA_HOME，或指到了 `\bin` 而不是 JDK 資料夾 |
| Maven 一直下載失敗 | 網路問題，或路徑有中文／空格 |
| `Port 8080 was already in use` | 上一次跑的還沒關，或別的程式佔用了 |
| `Unsupported class file major version` | 編譯用的 Java 版本比執行的新 |
| 改了 code 沒生效 | 沒重新編譯／沒重啟 |

---

## 五、心態

不會裝環境不代表不會寫程式，這兩件事是分開的技能。
差別只在於：**寫 code 學校會教，裝環境沒人教，都是自己踩出來的。**

踩的時候把錯誤訊息和解法記進 `DEV_LOG.md`。
下次遇到同一個錯，你會從「查半小時」變成「三十秒」。
這份紀錄後來在面試講「遇過什麼問題怎麼解」的時候，就是你的素材。
