## 1. Data Type

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

## 2. OOP

### Các tính chất

- `Kế thừa (Inheritance)`
  - Tính **kế thừa** cho phép xây dựng các **class** mới trên cơ sở của **class** hiện có. **Class** mới (con) sẽ được kế thừa các **Properties** và **Methods** của **Class** cha.
  - Việc sử dụng **kế thừa** giúp tiết kiệm thời gian và nỗ lực trong việc lập trình và giảm thiểu lỗi lặp lại. Nó cũng giúp tăng tính tái sử dụng của mã lập trình.

    ```java
    class Person {
        // Properties và Methods class Person
    }

    class Student extends Person {
        // Properties và Methods class Student
    }
    ```

    - **Class** `Student` này có các **Properties** và **Methods** riêng của chúng, nhưng vẫn có các **Properties** và **Methods** chung được kế thừa từ **class** `Person`
    - Lưu ý: Ngoài ra việc sử dụng từ khóa “extends”, chúng ta có thể sử dụng Interface trong Java để đạt được tính kế thừa.

- `Đa hình (Polymorphism)`
  - Tính đa hình (Polymorphism) là khả năng của các đối tượng (object) thể hiện các hành vi khác nhau khi được gọi bằng cùng một phương thức.
    - Tính đa hình giúp làm giảm sự phức tạp của mã lập trình, tăng tính linh hoạt của chương trình và giảm thiểu lỗi lặp lại.
    - Tính đa hình thể hiện trong Java - Trong Java, **tính đa hình** được thể hiện thông qua việc sử dụng phương thức **ghi đè** `@Override` và **nạp chồng** `@Overload`: - Trong **ghi đè** `@Override`, lớp con thay đổi lại một phương thức đã được định nghĩa trong lớp cha. Khi một đối tượng của lớp con gọi phương thức đó, nó sẽ thực thi phương thức mới của lớp con thay vì phương thức cũ của lớp cha. - Trong **nạp chồng** `@Overload`, một phương thức duy nhất có thể thực hiện các chức năng khác nhau tùy thuộc vào ngữ cảnh trong đó nó được gọi.

    ```java
    class Person {
        /* Methods */
        public String getInfo() {
            return "Name: " + this.fullName + ", Gender: " + this.gender + ", Birthday: " + this.birthDay;
        }
    }
    class Student extends Person {
        /* Methods */
        @Override
        public String getInfo() {
            // TODO Auto-generated method stub
            return super.getInfo() + ", Major: " + this.major;
        }
    }
    ```

- `Đóng gói (Encapsulation)`
  - Tính đóng gói (Encapsulation) cho phép chúng ta giấu thông tin của đối tượng và chỉ cho phép các phương thức được định nghĩa trong lớp đó mới có thể truy cập và sử dụng các thuộc tính và phương thức đó.
  - Trong Java, tính đóng gói được thực hiện bằng cách sử dụng các từ khóa truy cập (access modifiers), điều khiển khả năng nhìn thấy của biến và phương thức trong một lớp. Ba từ khóa truy cập trong Java bao gồm:
    - `Public`: Các biến và phương thức công khai (public) có thể truy cập từ bất kỳ đâu, bao gồm bên ngoài lớp.
    - `Private`: Các biến và phương thức riêng tư (private) chỉ có thể truy cập trong lớp mà chúng được định nghĩa.
    - `Protected`: Các biến và phương thức được bảo vệ (protected) có thể truy cập được trong cùng lớp và các lớp con của nó.

    ```java
    class Person {
        private String fullName;
        /* Getters && Setters */
        public String getFullName() {
            return fullName;
        }
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    }
    ```

- `Trừu tượng (Abstraction)`
  - Tính trừu tượng cho phép chúng ta tạo ra các lớp trừu tượng mà không cần cung cấp các triển khai cụ thể cho các phương thức của chúng.
  - Nó cũng giúp giảm sự phức tạp của mã lập trình bằng cách tập trung vào các hành động cần thiết của đối tượng mà không cần quan tâm đến các chi tiết cài đặt cụ thể.
  - Tính trừu tượng trong Java
    - Abstract class trong Java (Lớp trừu tượng) giúp đạt được tính trừu tượng từ 0 đến 100%.
    - Interfaces trong Java (giao diện) giúp đạt tính trừu tượng đến 100%.

    ```java
    abstract class Shape {
        protected int x;
        protected int y;

        public Shape(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public abstract void draw();
    }

    class Circle extends Shape {
        private int radius;

        public Circle(int x, int y, int radius) {
            super(x, y);
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println(“Drawing a circle at (” + x + “, ” + y + “) with radius ” + radius);
        }

    }
    ```

### Sự khác nhau giữa `Abstract class` && `Interface`

| `Abstract class`                                                                                                                                                                                                                                                           | `Interface`                                                                                                                                                                                            |
| :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Thể hiện tính trừu tượng < 100%                                                                                                                                                                                                                                            | Thể hiện tính trừu tượng 100%                                                                                                                                                                          |
| Lớp trừu tượng có thể có các phương thức abstract và non-abstract                                                                                                                                                                                                          | Phiên bản Java < 8, Interface chỉ có thể có phương thức abstract.<br>Phiên bản Java 8, có thể thêm default và static methods.<br>Phiên bản Java 9, có thể thêm private methods.                        |
| Lớp trừu tượng không hỗ trợ đa kế thừa                                                                                                                                                                                                                                     | Interface hỗ trợ đa kế thừa                                                                                                                                                                            |
| Lớp trừu tượng có thể có các biến final, non-final, static và non-static                                                                                                                                                                                                   | Interface chỉ có các biến static final                                                                                                                                                                 |
| Lớp trừu tượng có thể có phương thức static, phương thức main và constructor                                                                                                                                                                                               | Interface không thể có phương thức static, main hoặc constructor.                                                                                                                                      |
| Lớp trừu tượng có thể cung cấp trình triển khai của Interface                                                                                                                                                                                                              | Interface không cung cấp trình triển khai cụ thể của lớp abstract                                                                                                                                      |
| Sử dụng Abstract class khi chúng ta chỉ có thể hoàn thành một vài chức năng (method/ function) chuẩn của hệ thống, một vài chức năng còn lại các lớp extends phải hoàn thành. Những tính năng đã hoàn thành này vẫn sử dụng như bình thường, đây là những tính năng chung. | Sử dụng Interface khi bạn muốn tạo dựng một bộ khung chuẩn gồm các chức năng (method/ function) mà tất cả module/ project cần phải có. Các module phải implements tất cả chức năng đã được định nghĩa. |
