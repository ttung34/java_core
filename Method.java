// định nghĩa hàm(phương thức) trong java là một khối mã được đặt tên, 
// thực hiện một nhiệm vụ cụ thể và có thể được gọi từ những nơi khác trong chương trình.

//Tham số(paramenters) tham số là những biến được khai báo trong dấu ngoặc hoặc dấu ngoặc đơn của định nghĩa phương thức.
// Chúng cho phép truyền thông tin vào phương thức khi nó được gọi.
//* Tham số hình thức(formal paraments) các biến được khai báo trong định nghĩa phương thức. */
//*Đối số(arguments) giá trị thực tế được truyền vào khi gọi phương thức */

// Giá trị trả về là dữ liệu mà phương thức gửi trở lại cho đoạn mã đã gọi nó.
// Kiểu dữ liệu của giá trị trả về phải khớp với kiểu khai báo trong định nghĩa phương thức.
/*Nếu phương thức không trả về giá trị nào, kiểu giá trị sẽ là void */
/* Sử dụng từ khoá return để trả về giá trị từ phương thức */

public void sayHello() {
} // Phương thức không có đối số và cũng không cần trả về gì

public void sayHello(String name, int age) {
} // phương thức có tham số và cũng không có gía trị trả về 
public int add(int a, intb){} // phương thức có tham số và có giá trị trả về là kiểu số,
        
public void greet(String name){} 
public void greet(){
    greet("bạn")
}
// phương thức có tham số mặc định(java chưa hỗ trỡ nhưng có thể dùng overloading )

public int sum(int.. number){
    int total = 0;
    for(int num : numbers){
        total += num
    }
    return total;
}
// phương thức với số lượng tham số không xác định 

/*Các trường hợp sửu dụng phương thức trong java */

// Tái sử dụng mã (code reuse) viết mã một lần và sử dụng lại nhiều lần.
public double calculateArea(double radius){
    retrun Math.PI * radius *radius;
}

//Modun hoá: chia chương trình thành các phần nhỏ hơn, dễ quản lý.
public void processData(){
    getData();
    validateData();
    tranformData();
    saveData();
}

// Đóng gói: Che giấu chi tiết triển khai và chỉ hiển thị chức năng cần thiết.
private void updateInternalState() {

}
public void dôpenration() {
    updateInternalState();
}

// Phân chia trách nhiêm(Separation of concerns) Mỗi phương thức thực hiện nhiệm vụ cụ thể
public void validateUserInput(){}
public void saveUserData(){}
public void notifyUser() {}

// Đa hình Cùng tên phương thức nhưng khác hành vi thực hiện dựa trên số hoặc lớp.
public void display(int number){}
public void display(String name) {}
// Method overriding in subclasses
@Override
public void processData(){}