$ErrorActionPreference = 'Stop'

# 目前 LeetCode 最常見、最值得先內化的 19 個解題模板。
# 每個題型固定 5 題：先建立辨識，再練變形，不預先放答案。
$root = Join-Path (Get-Location) 'leetcode-core-practice'

$topics = @(
    [pscustomobject]@{ Folder = '01-arrays-and-hashing'; Name = '陣列與雜湊'; Signal = '要快速查找、計數、分組或判斷是否看過某個值。'; Problems = @(
        '1|Two Sum|Easy|補數查找與 HashMap 的查詢時機|two-sum',
        '217|Contains Duplicate|Easy|HashSet 去重與 O(n) 思維|contains-duplicate',
        '49|Group Anagrams|Medium|把等價字串轉成可雜湊的 key|group-anagrams',
        '238|Product of Array Except Self|Medium|前後綴累積，避免除法|product-of-array-except-self',
        '128|Longest Consecutive Sequence|Medium|只從序列起點開始延伸|longest-consecutive-sequence') }
    [pscustomobject]@{ Folder = '02-two-pointers'; Name = '雙指標'; Signal = '資料可排序、從兩端收縮，或要在原地處理陣列／字串。'; Problems = @(
        '125|Valid Palindrome|Easy|左右指標與略過非字母數字|valid-palindrome',
        '167|Two Sum II - Input Array Is Sorted|Medium|排序陣列的夾逼法|two-sum-ii-input-array-is-sorted',
        '15|3Sum|Medium|固定一個值後去重夾逼|3sum',
        '11|Container With Most Water|Medium|移動較短邊的證明|container-with-most-water',
        '42|Trapping Rain Water|Hard|左右最大值與雙指標收縮|trapping-rain-water') }
    [pscustomobject]@{ Folder = '03-sliding-window'; Name = '滑動視窗'; Signal = '題目問連續子陣列／子字串的最佳值、計數或是否存在。'; Problems = @(
        '121|Best Time to Buy and Sell Stock|Easy|維護歷史最小值|best-time-to-buy-and-sell-stock',
        '3|Longest Substring Without Repeating Characters|Medium|視窗不變量：字元不重複|longest-substring-without-repeating-characters',
        '209|Minimum Size Subarray Sum|Medium|正數陣列的收縮條件|minimum-size-subarray-sum',
        '567|Permutation in String|Medium|固定長度的頻率比較|permutation-in-string',
        '239|Sliding Window Maximum|Hard|單調佇列維護視窗最大值|sliding-window-maximum') }
    [pscustomobject]@{ Folder = '04-prefix-sum-and-difference'; Name = '前綴和與差分'; Signal = '反覆詢問區間和，或子陣列條件可轉成兩個前綴的關係。'; Problems = @(
        '303|Range Sum Query - Immutable|Easy|前綴和的基本定義|range-sum-query-immutable',
        '560|Subarray Sum Equals K|Medium|前綴和加計數 HashMap|subarray-sum-equals-k',
        '525|Contiguous Array|Medium|把 0/1 轉成 -1/+1|contiguous-array',
        '724|Find Pivot Index|Easy|左右和的等價式|find-pivot-index',
        '1094|Car Pooling|Medium|差分陣列做區間加減|car-pooling') }
    [pscustomobject]@{ Folder = '05-intervals'; Name = '區間'; Signal = '輸入由開始與結束時間組成，通常先依起點或終點排序。'; Problems = @(
        '56|Merge Intervals|Medium|排序後判斷重疊與合併|merge-intervals',
        '57|Insert Interval|Medium|插入前、重疊中、插入後三段|insert-interval',
        '435|Non-overlapping Intervals|Medium|依結束時間的貪心選擇|non-overlapping-intervals',
        '452|Minimum Number of Arrows to Burst Balloons|Medium|區間交集與最少選點|minimum-number-of-arrows-to-burst-balloons',
        '1288|Remove Covered Intervals|Medium|排序 tie-break 與最大終點|remove-covered-intervals') }
    [pscustomobject]@{ Folder = '06-stack-and-monotonic-stack'; Name = '堆疊與單調堆疊'; Signal = '需要配對、回退，或替每個元素找下一個更大／更小元素。'; Problems = @(
        '20|Valid Parentheses|Easy|配對規則與空堆疊邊界|valid-parentheses',
        '155|Min Stack|Medium|輔助堆疊維護最小值|min-stack',
        '150|Evaluate Reverse Polish Notation|Medium|運算子遇到兩個操作數|evaluate-reverse-polish-notation',
        '739|Daily Temperatures|Medium|遞減堆疊與等待天數|daily-temperatures',
        '84|Largest Rectangle in Histogram|Hard|哨兵與寬度計算|largest-rectangle-in-histogram') }
    [pscustomobject]@{ Folder = '07-binary-search'; Name = '二分搜尋'; Signal = '答案具單調性，或資料已排序；重點是明確定義搜尋區間。'; Problems = @(
        '704|Binary Search|Easy|[left, right] 區間不變量|binary-search',
        '35|Search Insert Position|Easy|找第一個大於等於 target 的位置|search-insert-position',
        '74|Search a 2D Matrix|Medium|將矩陣映射成一維索引|search-a-2d-matrix',
        '153|Find Minimum in Rotated Sorted Array|Medium|利用排序區段判斷|find-minimum-in-rotated-sorted-array',
        '33|Search in Rotated Sorted Array|Medium|先判斷哪一半有序|search-in-rotated-sorted-array') }
    [pscustomobject]@{ Folder = '08-linked-list'; Name = '鏈結串列'; Signal = '要改指標、找中點、找環，或從尾端定位節點。'; Problems = @(
        '206|Reverse Linked List|Easy|prev / current / next 三指標|reverse-linked-list',
        '21|Merge Two Sorted Lists|Easy|dummy node 與尾指標|merge-two-sorted-lists',
        '141|Linked List Cycle|Easy|快慢指標相遇|linked-list-cycle',
        '19|Remove Nth Node From End of List|Medium|固定間距雙指標|remove-nth-node-from-end-of-list',
        '143|Reorder List|Medium|找中點、反轉、交錯合併|reorder-list') }
    [pscustomobject]@{ Folder = '09-tree-dfs'; Name = '樹：DFS'; Signal = '答案由子樹遞迴得出，或路徑狀態要由上往下傳遞。'; Problems = @(
        '104|Maximum Depth of Binary Tree|Easy|遞迴 base case 與子問題|maximum-depth-of-binary-tree',
        '226|Invert Binary Tree|Easy|後序交換左右子樹|invert-binary-tree',
        '543|Diameter of Binary Tree|Easy|高度回傳、直徑全域更新|diameter-of-binary-tree',
        '112|Path Sum|Easy|根到葉的剩餘目標值|path-sum',
        '124|Binary Tree Maximum Path Sum|Hard|可延伸貢獻與不可同時向上分叉|max-path-sum') }
    [pscustomobject]@{ Folder = '10-tree-bfs-and-bst'; Name = '樹：BFS 與 BST'; Signal = '要逐層處理，或 BST 的排序性可用來剪枝。'; Problems = @(
        '102|Binary Tree Level Order Traversal|Medium|queue 與每層固定大小|binary-tree-level-order-traversal',
        '199|Binary Tree Right Side View|Medium|每層最後一個節點|binary-tree-right-side-view',
        '98|Validate Binary Search Tree|Medium|上下界，而非只比較父節點|validate-binary-search-tree',
        '230|Kth Smallest Element in a BST|Medium|中序走訪的排序性|kth-smallest-element-in-a-bst',
        '236|Lowest Common Ancestor of a Binary Tree|Medium|左右子樹回傳值的合併|lowest-common-ancestor-of-a-binary-tree') }
    [pscustomobject]@{ Folder = '11-heap-and-priority-queue'; Name = '堆積與優先佇列'; Signal = '每一步都要快速取出目前最小／最大 K 個候選。'; Problems = @(
        '215|Kth Largest Element in an Array|Medium|大小 K 的 min-heap|kth-largest-element-in-an-array',
        '347|Top K Frequent Elements|Medium|頻率表加 heap|top-k-frequent-elements',
        '973|K Closest Points to Origin|Medium|距離 key 與 K 筆保留|k-closest-points-to-origin',
        '23|Merge k Sorted Lists|Hard|每條串列的目前最小節點|merge-k-sorted-lists',
        '621|Task Scheduler|Medium|冷卻時間的排程模型|task-scheduler') }
    [pscustomobject]@{ Folder = '12-backtracking'; Name = '回溯'; Signal = '要列舉所有組合、排列、切割方式或路徑。'; Problems = @(
        '78|Subsets|Medium|選或不選的決策樹|subsets',
        '46|Permutations|Medium|used 陣列與路徑撤銷|permutations',
        '39|Combination Sum|Medium|可重複選取與避免重複組合|combination-sum',
        '79|Word Search|Medium|格子 DFS 與回復現場|word-search',
        '131|Palindrome Partitioning|Medium|切割位置與回文判斷|palindrome-partitioning') }
    [pscustomobject]@{ Folder = '13-graph-traversal'; Name = '圖：DFS／BFS'; Signal = '節點與邊形成連通關係，要走訪、染色或計算連通元件。'; Problems = @(
        '200|Number of Islands|Medium|網格圖的淹沒走訪|number-of-islands',
        '133|Clone Graph|Medium|舊節點到新節點的 mapping|clone-graph',
        '994|Rotting Oranges|Medium|多起點 BFS 與層數|rotting-oranges',
        '130|Surrounded Regions|Medium|從邊界反向標記|surrounded-regions',
        '417|Pacific Atlantic Water Flow|Medium|從兩側海洋反向走|pacific-atlantic-water-flow') }
    [pscustomobject]@{ Folder = '14-topological-sort-and-union-find'; Name = '拓撲排序與 Union-Find'; Signal = '有先後依賴，或題目問動態連通性／是否成環。'; Problems = @(
        '207|Course Schedule|Medium|入度與 BFS 判環|course-schedule',
        '210|Course Schedule II|Medium|輸出一個合法拓撲順序|course-schedule-ii',
        '684|Redundant Connection|Medium|加入邊前檢查根是否相同|redundant-connection',
        '547|Number of Provinces|Medium|集合合併與連通元件數|number-of-provinces',
        '721|Accounts Merge|Medium|用 email 當圖節點或集合元素|accounts-merge') }
    [pscustomobject]@{ Folder = '15-greedy'; Name = '貪心'; Signal = '每一步選局部最佳，且可透過交換論證或不變量證明。'; Problems = @(
        '55|Jump Game|Medium|可到達的最遠邊界|jump-game',
        '45|Jump Game II|Medium|目前層與下一層邊界|jump-game-ii',
        '134|Gas Station|Medium|總和條件與重設起點|gas-station',
        '763|Partition Labels|Medium|每個字元最後出現位置|partition-labels',
        '678|Valid Parenthesis String|Medium|用上下界表示可能的左括號數|valid-parenthesis-string') }
    [pscustomobject]@{ Folder = '16-dynamic-programming-1d'; Name = '動態規劃：一維'; Signal = '目前最佳答案只依賴前面少數狀態，且子問題會重複。'; Problems = @(
        '70|Climbing Stairs|Easy|狀態與轉移的最小範例|climbing-stairs',
        '198|House Robber|Medium|選與不選的相鄰限制|house-robber',
        '213|House Robber II|Medium|環狀問題拆成兩個線性問題|house-robber-ii',
        '139|Word Break|Medium|前綴可切分狀態|word-break',
        '91|Decode Ways|Medium|單字元與雙字元轉移|decode-ways') }
    [pscustomobject]@{ Folder = '17-dynamic-programming-2d'; Name = '動態規劃：二維'; Signal = '答案依賴兩個維度，例如格子位置、兩條字串的前綴。'; Problems = @(
        '62|Unique Paths|Medium|網格遞推與邊界初始化|unique-paths',
        '63|Unique Paths II|Medium|障礙物如何改寫轉移|unique-paths-ii',
        '64|Minimum Path Sum|Medium|最小成本的狀態轉移|minimum-path-sum',
        '1143|Longest Common Subsequence|Medium|比對或跳過兩個字元|longest-common-subsequence',
        '72|Edit Distance|Hard|插入、刪除、替換三種操作|edit-distance') }
    [pscustomobject]@{ Folder = '18-knapsack-and-subsequence'; Name = '背包與子序列'; Signal = '選或不選物品、湊出目標，或維護遞增子序列。'; Problems = @(
        '416|Partition Equal Subset Sum|Medium|0/1 背包的布林狀態|partition-equal-subset-sum',
        '322|Coin Change|Medium|完全背包的最小值|coin-change',
        '300|Longest Increasing Subsequence|Medium|dp 與 binary search 最佳化|longest-increasing-subsequence',
        '377|Combination Sum IV|Medium|排列數與迴圈順序|combination-sum-iv',
        '474|Ones and Zeroes|Medium|雙容量 0/1 背包|ones-and-zeroes') }
    [pscustomobject]@{ Folder = '19-bit-manipulation-and-strings'; Name = '位元與字串匹配'; Signal = '狀態可壓成 bit，或需要線性地找出字串模式。'; Problems = @(
        '136|Single Number|Easy|XOR 的消去性|single-number',
        '191|Number of 1 Bits|Easy|n & (n - 1) 清除最低位 1|number-of-1-bits',
        '338|Counting Bits|Easy|由已知較小數推導|counting-bits',
        '268|Missing Number|Easy|XOR 與總和兩種不變量|missing-number',
        '28|Find the Index of the First Occurrence in a String|Easy|先暴力，再理解 KMP prefix table|find-the-index-of-the-first-occurrence-in-a-string') }
)

function New-SafeFileName([string]$name) {
    return ($name.ToLower() -replace '[^a-z0-9]+', '-').Trim('-')
}

New-Item -ItemType Directory -Path $root -Force | Out-Null

$roadmapReadme = @"
# LeetCode 核心演算法內化計畫

這份計畫涵蓋現階段最常出現在 LeetCode、且最能改善解題辨識速度的 **19 個題型、95 題**。它不是「所有演算法」的宣稱；完成並複盤這些核心模板後，再擴展到最短路徑、最小生成樹、線段樹等進階主題會更有效率。

## 使用規則

1. 依資料夾順序刷；每題先給自己 25 分鐘，Hard 題 40 分鐘。
2. 逾時時先寫出暴力解與卡點，再看提示；不可直接抄完整解答。
3. 解完後隔 **1 天、7 天、21 天** 重做；三次都能在時限內寫出才算內化。
4. 每題檔案最後留下：辨識訊號、核心不變量、第一個失敗案例、下次能更快想到的線索。

## 進階門檻

- 每個資料夾 5 題至少有 4 題首次或複刷能在時限內完成。
- 能不看答案說明「為什麼」該模板正確、時間與空間複雜度。
- 同類新題能在 3 分鐘內說出候選模板與不變量。

## 題型順序

| 順序 | 題型 | 題數 |
|---:|---|---:|
$(($topics | ForEach-Object { "| $($_.Folder.Substring(0,2)) | [$($_.Name)]($($_.Folder)/README.md) | 5 |" }) -join "`n")
"@
Set-Content -LiteralPath (Join-Path $root 'README.md') -Value $roadmapReadme -Encoding utf8

foreach ($topic in $topics) {
    $topicPath = Join-Path $root $topic.Folder
    New-Item -ItemType Directory -Path $topicPath -Force | Out-Null
    $rows = @()
    $number = 1
    foreach ($raw in $topic.Problems) {
        $parts = $raw.Split('|')
        $id, $title, $difficulty, $focus, $slug = $parts
        $fileName = '{0:D2}-{1}-{2}.md' -f $number, $id, (New-SafeFileName $title)
        $rows += "| $number | [$id. $title]($fileName) | $difficulty | $focus |"
        $problem = @"
# $id. $title

- 難度：$difficulty
- 題目：[LeetCode $id](https://leetcode.com/problems/$slug/)
- 這題要練：$focus
- 建議時限：$(if ($difficulty -eq 'Hard') { '40 分鐘' } else { '25 分鐘' })

## 解題前

- [ ] 我能說出輸入、輸出與至少一個邊界案例。
- [ ] 我先寫出暴力解的複雜度。
- [ ] 我寫下本題想維持的不變量／狀態。

## 解題後複盤

- [ ] 我的辨識訊號：
- [ ] 核心不變量或狀態轉移：
- [ ] 第一個失敗案例：
- [ ] 時間／空間複雜度：
- [ ] 1 天後重做：
- [ ] 7 天後重做：
- [ ] 21 天後重做：
"@
        Set-Content -LiteralPath (Join-Path $topicPath $fileName) -Value $problem -Encoding utf8
        $number++
    }
    $index = @"
# $($topic.Name)

## 辨識訊號

$($topic.Signal)

## 練習順序

| # | 題目 | 難度 | 這題要練 |
|---:|---|---|---|
$($rows -join "`n")

## 過關標準

連續兩次在時限內完成至少 4 題，且每題都能說明模板選擇與複雜度，才進入下一個資料夾。
"@
    Set-Content -LiteralPath (Join-Path $topicPath 'README.md') -Value $index -Encoding utf8
}

Write-Host "Created $($topics.Count) topics and $($topics.Count * 5) problem files at: $root"
