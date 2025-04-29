public class StringS {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        System.out.println(str);
        System.out.println(str.substring(6, 10));
        // substring: trích xuất một phần của chuỗi từ vị trí startIndex đến endIndex-1
        System.out.println(str.replace('o', '0'));
        // replace thay thế tất cả các giá trị cũ bằng giá trị mới
        String[] parts = str.split(" ");
        for(String part: parts){
            System.out.println(part);
        }
         // split dùng để chia các chuỗi con dựa trên biểu thức chính.
         System.out.println(str.toUpperCase());
         // toUpperCase dùng để viết hoa tất cả các chữ cái trong chuỗi.
         System.out.println(str.trim());
         /* Dùng để loại bỏ khoảng trắng đầu và cuối câu */
         char index = str.charAt(6);
         System.out.println(index );
        /* Trả về ký tự tại vị trí index */
    }
}


// String là một lớp trong java dùng để biểu diễn chuỗi ký tự.
// Khi tạo một String, nội dung của nó không thể thay đổi.