
import java.util.Scanner;

public class OneWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất của mảng là: " + max);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Tổng các giá trị trong mảng là: " + sum);

        int sums = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sums += arr[i];
            }
        }
        System.out.println("Tổng các giá trị chẵn trong mảng là: " + sums);

        System.out.println("Nhập giá trị cần chèn");
        int x = scanner.nextInt();

        System.out.println("Nhập vị trí cần chèn(0 đến " + n + "): ");
        int k = scanner.nextInt();

        if (k < 0 || k > n) {
            System.out.println("Vị trí không hợp lệ");

        } else {
            for (int i = n; i > k; i--) {
                arr[i] = arr[i - 1];
            }
            arr[k] = x;
            System.out.println("Mảng sau khi chèn");
            for (int i = 0; i <= n; i++) {
                System.out.println(arr[i] +"");
            }
        }


        scanner.close();
    }
}

/*Mảng một chiều trong java là một cấu trúc dữ liệu cho phép lưu trữ nhiều phần tử cùng kiểu dữ liệu trong một biến duy nhất. Mỗi phần từ được truy caoaj thông qua chỉ số index */
/*Mảng 2 chiều tỏng java là một mảng của các mảng tạo thành cấu trúc dữ liệu dạng bảng với hàng và cột */