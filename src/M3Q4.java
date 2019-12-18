import java.util.Scanner;

public class M3Q4 {

    public static void main(String[] args) {    /*main所在為主函式*/
        Scanner sc = new Scanner(System.in);
        int w1 = sc.nextInt();
        int h1 = sc.nextInt();

        fun(w1,h1);
    }

    public static void fun(int w,int h){
        int[][] data = new int[h][w];

        for (int i=1;i<=h;i++){
            for (int j=1;j<=w;j++) {
                data[i-1][j-1]=i*j;
                System.out.print(data[i-1][j-1]+"\t");
            }
            System.out.println();
        }
    }
}
