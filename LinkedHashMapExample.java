
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> maps = new TreeMap<>();
        System.out.println("Nhập giá trị vào tree: ");
        int n = scanner.nextInt(); // Nhập số lượng sinh viên
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Giá trị key: " + (i + 1) + " là: ");
            String key = scanner.nextLine();
            System.out.println("Gía trị value của " + key + " là: ");
            int value = scanner.nextInt();
            scanner.nextLine();
            maps.put(key, value);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(maps.entrySet());
        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey()+ " - "+entry.getValue());
        }
    }
}
