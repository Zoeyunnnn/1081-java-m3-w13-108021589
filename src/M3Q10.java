import java.util.Scanner;

public class M3Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] data = new int[n];
        for (int i=0;i<n;i++) data[i] = sc.nextInt();

        int maxV=0,v1=0;
        for (int i=0;i<n;i++){
            v1 = data[i];
            for (int j=i+1;j<n;j++){
                v1 *= data[j];
                if (maxV<v1) maxV = v1;
            }
        }
        System.out.println(maxV);
    }
}
