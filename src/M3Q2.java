import java.util.Random;
import java.util.Scanner;

public class M3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(23323456);
        int data[] = new int[6];

        int i=0;
        boolean flag = true;
        while (i<6){
            flag = true;
            data[i] = rand.nextInt(42)+1;
            for (int j=0;j<i;j++){
                if (data[i] == data[j]) {
                    flag = false;
                    break;
                }
            }if (flag)i++;
        }
        for (int v1 : data){
            System.out.printf("%d\t",v1);
        }
        System.out.println();
    }
}
