public class bai4 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 8, 9, 21, 34, 56, 32, 12, 37};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Gia tri lon nhat : " + max);

        int tong = arr[0] + arr[arr.length - 1];
        System.out.println("tong so dau va so cuoi = " + tong);

        int sochan = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sochan += arr[i];
            }
        }
        System.out.println("tong so chan la " + sochan);

        int sole = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sole += arr[i];
            }
        }
        System.out.println("tong so le la " + sole);
    }
}