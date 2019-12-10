import java.util.Scanner;

public class M3Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] data = new int[y][x];

        int sum = 1,t=1;
        for (int i=1;i<=y;i++){
            t=1;
            for (int j=0;j<x;j++){
                sum = i;
                sum *= t;
                System.out.print(sum+"\t");
                t++;
            }
            System.out.println();
        }
    }
}
