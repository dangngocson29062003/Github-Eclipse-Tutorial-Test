## Data Type

### Primitive Data Type

#### `byte`

- Kiểu dữ liệu `byte` trong Java lưu trữ số nguyên giữa phạm vi `-128` - `127`.

#### `short`

- Kiểu dữ liệu `short` có kích thước lớn hơn `byte` nhưng nhỏ hơn `int`. Nó có thể giữ các giá trị giữa phạm vi `-32768` - `32767`.

#### `int`

- Kiểu dữ liệu `int` được sử dụng phổ biến nhất trong **Java** để lưu trữ số nguyên. Nó có thể lưu trữ các giá trị trong phạm vi `-2,147,483,648` - `2,147,483,647`. Cách tính khác `-2^31` - `2^31 - 1`.

#### `long`

- Kiểu dữ liệu `long` trong Java khi cần lưu trữ một giá trị lớn hơn giới hạn số nguyên. Giá trị khoảng `-9,223,372,036,854,775,808` - `9,223,372,036,854,775,807`. Cách tính khác `-2^63` - `2^63 - 1`.
- Lưu ý khi khai báo kiểu dữ liệu `long` cần "L" đằng sau number

```java
// Nếu thiếu "L" thì number1 vẫn hiểu đang là kiểu dữ liệu int
long number1 = 10000000000; // The literal 10000000000 of type int is out of range
long number2 = 10000000000L;
```

#### `float`

- Kiểu dữ liệu `32bit`, dùng lưu trữ số thập phân. Giá trị mặc định `0.0F`, thường dùng để lưu trữ tiền tệ...

#### `double`

- Kiểu dữ liệu `64bit`, lưu trữ không giới hạn kích thước, lưu trữ số thực. Giá trị mặc là định là `0.0D`

#### `char`

- Kiểu dữ liệu lưu trữ 1 ký tự `16bit` mã **Unicode**. Dùng để lưu trữ kí tự bất kì.

#### `Boolean`

- Kiểu dữ liệu `boolean` này chỉ có hai dạng giá trị: `true` hoặc `false`. Dùng để biểu thị các trạng thái hoặc kết quả của các biểu thức điều kiện

### Non-Primitive Data Type

### `String`

### `array`

### `class`

### `interface`
