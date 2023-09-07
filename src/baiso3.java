import java.util.Scanner;

public class baiso3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao danh sach so");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap phan tu mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}

