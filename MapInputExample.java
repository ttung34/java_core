import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class MapInputExample {
    public static void main(String[] args) {
        // Tạo một HashMap để lưu tên sinh viên và tuổi
        Map<String, Integer> studentAges = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt(); // Nhập số lượng sinh viên
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng còn lại sau nextInt()

        // Vòng lặp nhập dữ liệu
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Nhập tuổi của " + name + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng còn lại sau nextInt()

            // Thêm vào HashMap
            studentAges.put(name, age);
        }

        // Hiển thị danh sách sinh viên
        System.out.println("\nDanh sách sinh viên và tuổi:");
        for (Map.Entry<String, Integer> entry : studentAges.entrySet()) {
            System.out.println("Tên: " + entry.getKey() + ", Tuổi: " + entry.getValue());
        }

        System.out.println("\n Nhập tên mà bạn muốn lấy ra: ");
        String names = scanner.nextLine();
        System.out.println("Lấy theo tên: " + names + " " + studentAges.get(names));

        // Xoá giá trị trong Map
        Iterator<Map.Entry<String, Integer>> iterator = studentAges.entrySet().iterator();
        // System.out.println("Iterator: " +iterator.next().getKey().equals("Hoa") );
        while (iterator.hasNext()) {
            if (iterator.next().getValue() >20) {
                iterator.remove();
            }
        }
        // xoá theo điều kiện mà hàm equals đã yêu cầu như xoá những key có giá trị A trong đó
        
        // for (Map.Entry<String, Integer> entry : studentAges.entrySet()) {
        //     System.out.println("Tên: " + entry.getKey() + ", Tuổi: " + entry.getValue());
        // }
        System.out.println("Remove: " + studentAges.remove(names));
        System.out.println("Sau khi xóa: " + studentAges);
    }
}
