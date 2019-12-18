import java.util.Scanner;

public class M3Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] data = new int[n][n];

        int m=1;
        for (int i=0;i<n;i++){
            if (i%2==0){
                for (int j=0;j<n;j++) data[i][j] = m++;
            }else {
                for (int j=n-1;j>=0;j--) data[i][j] = m++;
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) System.out.print(data[i][j]+"\t");
            System.out.println();
        }
        System.out.println();

        for(int j=0;j<n;j++){
            for (int i=0;i<n;i++) System.out.print(data[i][j]+"\t");
            System.out.println();
        }
    }
}
