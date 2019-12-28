import java.util.Scanner;

public class M3Q21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] data = new int[3][5];
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j+=2) data[i][j] = sc.nextInt();
        }

        boolean flag = false;
        for (int i=0;i<3;i++){
            switch (i){
                case 0:
                    if (data[i][i]==data[i+1][i+2] && data[i][i]==data[i+2][i+4]){
                        flag = true;
                    }else if (data[i][i]==data[i][i+2] && data[i][i]==data[i][i+4]){
                        flag = true;
                    }else if (data[i][i]==data[i+1][i] && data[i][i]==data[i+2][i]){
                        flag = true;
                    }else flag = false;
                    break;
                case 1:
                    if (data[i-1][i+1]==data[i][i+1] && data[i][i+1]==data[i+1][i+1]){
                        flag = true;
                    }else if (data[i][i-1]==data[i][i+1] && data[i][i+1]==data[i][i+3]){
                        flag = true;
                    }else if (data[i+1][i-1]==data[i+1][i+1] && data[i+1][i+1]==data[i+1][i+3]){
                        flag = true;
                    }else flag = false;
                    break;
                case 2:
                    if (data[i-2][i+2]==data[i-1][i] && data[i-1][i]==data[i-2][i-2]){
                        flag = true;
                    }else if (data[i-2][i+2]==data[i-1][i+2] && data[i-1][i+2]==data[i][i+2]){
                        flag = true;
                    }else flag = false;
                    break;
                default:
                    break;
            }
            if (flag){
                System.out.println("True");
                break;
            }
        }if (!flag) System.out.println("False");
    }
}
