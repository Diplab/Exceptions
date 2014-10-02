CH.12  Error handling with Exceptions
======


## Outline

- [前言](#前言)
    + [什麼是Exception](#什麼是Exception)
	+ [Exception-handling的重要](#Exception-handling的重要)
- [Throwable](#Throwable)
	+ [Error](#Error)
	+ [Exception](#Exception)
	+ [Runtime Exception](#Runtime Exception)
- [Tryblock](#Tryblock)
- [多重Catch](#Catch)
- [建造自己的 exceptions](#建造自己的 exceptions)


-
## 前言

### 什麼是Exception
在程式執行過程中，程式發生不正常的錯誤，而導致無法繼續執行的情形。


### Exception-handling的重要
它可以確保系統的可用性與可靠性，提高軟體應付異常狀況的能力，避免系統在意想不到的狀況下發生錯誤，甚至導致服務中斷或資料毀損。
早期的程式語言本身並不支援例外處理，像 C 語言靠的是利用函式回傳值的檢查，如果不檢查很容易讓系統發生錯誤，且容易破壞程式結構。
現代較新的物件導向程式語言，像 Java、C# 或 Visual Basic .NET 則提供了 try...catch...finally陳述式，這是一個很棒的結構化例外處理(Structured Exception Handling) 機制，不僅可以有效簡化例外處理複雜度，還可維持程式碼可讀性。


### 程式閱讀困難 且結構被破壞:
```
public class ReadFile {
	public int Read() {
		int ErrCode = 0;
		開啟檔案;
		if (檔案存在) {
			決定檔案大小;
			if (檔案大小已定) {
				配置記憶體;
				if (記憶體足夠) {
					將檔案讀入記憶體;
					if (讀入成功) {
					開始操作檔案內容; }
					else {
						ErrCode = -1; } }
				else {
					ErrCode = -2; } }
			else {
				ErrCode = -3 }
			關閉檔案;
			if (檔案無法關閉 && 無其它錯誤)
				ErrCode = -4;
			else
				ErrCode = -5; }
		else
			ErrCode = -6;
		return ErrCode;
		}
}
```

### Structured Exception Handling
```
Public class ReadFile {
		public int Read() {
				try {
					開啟檔案;
					決定檔案大小;
					配置記憶體;
					將檔案讀入記憶體;
					關閉檔案;
				} catch (檔案打不開) {
					return –1;
				} catch (無法決定大小) {
					return –2;
				} catch (記憶體不夠) {
					return –3;
				} catch (檔案讀不進來) {
					return –4;
				} catch (檔案關不掉) {
					return –5
				}
		}
}
```
-

## Throwable
Java將所有的Exception宣告成物件，且全部都是屬於Throwable物件的子孫
![Throwable.jpg](img/Throwable.jpg)

### Errors
- 非常嚴重而無法進行處理的狀況 EX:記憶體故障 OS問題
- 大多數的應用程式不會嘗試去取得此類資訊也無法處理
- 由Java virtual machine 進行處理





