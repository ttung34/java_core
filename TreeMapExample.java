
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị vào tree: ");
        int n = scanner.nextInt(); // Nhập số lượng sinh viên
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Giá trị key: " + (i + 1) + " là: ");
            String key = scanner.nextLine();
            System.out.println("Gía trị value của " + key + " là: ");
            int value = scanner.nextInt();
            scanner.nextLine();
            map.put(key, value);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}

// giá trị chèn theo thứ tự như bảng chữ cái, giá trị của value,
