import java.util.Arrays;
import java.util.Scanner;

public class M3Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] data = new long[n];
        for (int i=0;i<n;i++) data[i] = sc.nextInt();


        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (data[i]>data[j]){
                    long tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
            System.out.println(data[i]);
        }
        /**Arrays.sort(data);
        for (int i=0;i<n;i++) System.out.println(data[i]);**/
    }
}
