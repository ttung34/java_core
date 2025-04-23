
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng giá trị là: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Gía trị của key thứ " + (i + 1) + " là: ");
            String key = scanner.nextLine();
            System.out.println("Giá trị của " + key + " là: ");
            int value = scanner.nextInt();
            scanner.nextLine();
            studentMap.put(key, value);
        }
        System.out.println("Danh sách các cặp giá trị trong student là: ");
        for (String key : studentMap.keySet()) {
            System.out.println("Tên: " + key + ", Tuổi: " + studentMap.get(key));
        }

        System.out.println("Giá trị cần lấy là: ");
        String nameKey = scanner.nextLine();
        System.out.println("Tên: " + nameKey + ", Tuổi: " + studentMap.get(nameKey));
        
        System.out.println("Giá trị muốn xoá là: ");
        String nameDelete = scanner.nextLine();
        studentMap.remove(nameDelete);

        System.out.println("Danh sách các cặp giá trị trong student sau khi xoá là: " + studentMap);
        
    }
}
