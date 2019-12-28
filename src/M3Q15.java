import java.util.Scanner;

public class M3Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();

        int[][] a = new int[n1][m1];
        int[][] b = new int[n2][m2];
        for (int i=0;i<n1;i++){
            for (int j=0;j<m1;j++) a[i][j] = sc.nextInt();
        }for (int i=0;i<n2;i++){
            for (int j=0;j<m2;j++) b[i][j] = sc.nextInt();
        }

        int[][] data = new int[n1][m2];

        for (int i=0;i<n1;i++){
            for (int j=0;j<m2;j++){
                int t=1,sum=0;
                while (t<=m1){
                    sum += a[i][t-1]*b[t-1][j];
                    t++;
                }
                data[i][j] = sum;
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
