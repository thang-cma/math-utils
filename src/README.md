# Math Utils - JUnit Testing

## 📌 Mô tả
Project gồm các hàm toán học cơ bản:
- perimeter
- area
- solveQuadratic
- daysInMonth
- isPrime
- sumAlternating
- gcd
- factorial
- sumFactorial

## ✅ Testing
Sử dụng JUnit để test.

## 🎯 Coverage
- 100% Statement Coverage
- 100% Branch Coverage

## ▶️ Cách chạy
```bash
mvn clean test
📊 Coverage Report
open target/site/jacoco/index.html
📂 Cấu trúc
src/main/java/com/example/MathUtils.java
src/test/java/com/example/MathUtilsTest.java

---

## 2. Tạo test case list (giảng viên hay hỏi)

Thêm vào README hoặc file riêng:

```md
## Test Cases

### perimeter
- (2,3) → 10
- (0,3) → exception

### area
- (2,3) → 6
- (-1,3) → exception

### solveQuadratic
- delta < 0 → No real roots
- delta = 0 → Double root
- delta > 0 → Two roots
- a = 0 → One root / No solution

### daysInMonth
- Feb leap year → 29
- Feb normal → 28
- Month 4 → 30
- Month 1 → 31

### isPrime
- 2 → true
- 4 → false
- 1 → false

### gcd
- (6,9) → 3
- (0,5) → 5
- (0,0) → exception

### factorial
- 5 → 120
- 0 → 1
- -1 → exception