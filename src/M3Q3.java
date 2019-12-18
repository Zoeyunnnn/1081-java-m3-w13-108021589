import java.util.Scanner;

public class M3Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] data = new int[5][7];

        for (int i=0;i<5;i++){
            for (int j=0;j<7;j++) data[i][j] = sc.nextInt();
        }

        for (int j=0;j<7;j++){
            for (int i=0;i<5;i++) System.out.print(data[i][j]+"\t");
            System.out.println();
        }
/*81 7 7 10 97 0 97
90 67 8 25 1 39 34
9 54 63 53 53 55 77
28 8 17 50 41 99 889
5 1 95 99 76 92 60*/
    }
}
