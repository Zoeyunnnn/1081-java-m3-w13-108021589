import java.util.Scanner;

public class M3Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i=0;i<n;i++) data[i] = sc.nextInt();

        int maxV = data[0] * data[1], v1;
        for (int i = 1; i < n; i++) {
            if (i + 1 == 6) break;
            v1 = data[i] * data[i + 1];
            if (maxV < v1) maxV = v1;
        }
        System.out.println(maxV);
    }
}
