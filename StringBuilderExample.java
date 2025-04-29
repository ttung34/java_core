

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "progaming";
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            System.out.println(count);
            // Kiểu viết này dùng để khi có một giá trị giống với giá trị trong mảng thì sẽ chỉ cần thêm số lượng mà không cần thêm giá trị mới nữa sẽ đỡ diện tích của mảng hơn.
            // System.out.println(str.charAt(i));

            // System.out.println("  ");
            // System.out.println(count[str.charAt(i)]);
        // System.out.println(count[i]);

        }
        StringBuilder result = new StringBuilder();
        for (int a = 0; a < 256; a++) {
            if (count[a] > 0) {
                // System.out.println(count[i]);
                result.append((char) a);
            System.out.println((char) a);

            }
            // Số lần xuất hiện của một chữ trong chuỗi
            /*(char) i ép i thành ký tự rồi thêm vào result, thêm vào theo thứ tự của bảng chữ cái, từ đầu đến cuối*/
            /*Kiểu char đây là épm kiểu số nguyên i sang kiểu char */
            /* Trong bảng mã ASCII mỗi giá trị số nguyên từ 0 đến 255 tương ứng với một ký tự */
        }
    }
}

/* StringBuilder là một lớp có thể thay đổi dùng để xây dựng và thao tác chuỗi ký tự. */
/* Nó hiệu quả hơn String khi cần thực hiện nhiều thay đổi trên chuỗi */
/* append thêm dữ liệu và cuối chuỗi */
/* insert chèn dữ liệu vào vị trí chỉ định. */
/* delete xoá một phần chuỗi */
/* reverse đảo ngược chuỗi */