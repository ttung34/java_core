import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortByObject {
    public static void main(String[] args) {
        Comparator<Person> byName = (s1, s2) -> s1.name.compareTo(s2.name);

        TreeMap<Person, Integer> studentScores = new TreeMap<>(byName);

        studentScores.put(new Person("Nam", 22), 8);
        studentScores.put(new Person("Hoa", 20), 9);
        studentScores.put(new Person("An", 25), 7);

        for (Map.Entry<Person, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm: " + entry.getValue());
        }

    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }
}

// Kiểu dữ liệu TreeMap này là bắt buộc so sánh các giá trị key, hoặc value, tuy nhiên, ở đây key là một giá trị lớp
// Person nên không thể tự so sánh với nhau giữa các lớp, vậy nên dùng cách compar ra để so sánh gia trị trong class Person để có thể sắp xếp các gía trị trong treeMap được oki nhất 
