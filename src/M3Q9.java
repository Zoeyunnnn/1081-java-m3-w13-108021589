import java.util.Arrays;
import java.util.Scanner;

public class M3Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] Str = sc.nextLine().split(" ");

        int[] data = new int[Str.length];
        for (int t=0;t<Str.length;t++)data[t] = Integer.parseInt(Str[t]);

        for (int i=0;i<Str.length;i++){
            for (int j=i+1;j<Str.length;j++){
                if (data[i] > data[j]){
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }System.out.print(data[i]+"\t");
        }
        System.out.println();
    }
}
