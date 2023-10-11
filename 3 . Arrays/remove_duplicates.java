import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {
        int N, len = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        N = scanner.nextInt();
        System.out.println("Enter the elements of the array");
        int[] a = new int[N];
        int[] temp_a = new int[N];
        int count;

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        temp_a[len] = a[0];
        int x, y;

        for (x = 0; x < N; x++) {
            count = 0;
            for (y = 0; y < len; y++) {
                if (a[x] == temp_a[y]) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                temp_a[len] = a[x];
                len++;
            }
        }

        System.out.println("Array without duplicates is");
        for (int i = 0; i < len; i++) {
            System.out.print(temp_a[i] + " ");
        }

    }
}
