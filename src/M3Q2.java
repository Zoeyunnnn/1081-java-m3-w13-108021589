import java.util.Random;
import java.util.Scanner;

public class M3Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] data = new int[6];
        Random rand = new Random();
        rand.setSeed(23323456);

        boolean flag = true;
        int i = 0;
        while (i<6){
            flag = true;
            data[i] = rand.nextInt(42)+1;
            for (int j=i+1;j<data.length;j++){
                if (data[i]==data[j]){
                    flag = false;
                    break;
                }
            }if (flag)i++;
        }for (int v : data){
            System.out.printf("%d\t",v);
        }
        System.out.println();
    }
}
