import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        int N;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ao Khach hang mua: ");
        N = scanner.nextInt();
        scanner.close();
        System.out.print("Thanh tien: ");
        if (N >= 100) {
            System.out.print(N * 80000);
        } else if (N >= 10) {
            System.out.print(N * 100000);
        } else if (N > 0) {
            System.out.print(N * 120000);
        } else if (N == 0) {
            System.out.print(N * 0);
        } else {
            System.out.print("Invalid");
        }
    }
}