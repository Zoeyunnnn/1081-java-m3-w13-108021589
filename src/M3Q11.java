import java.util.Scanner;

public class M3Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) data[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += data[j];
                if (sum == 0) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(data[k] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}
