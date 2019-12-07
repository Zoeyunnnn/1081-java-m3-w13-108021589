import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class M3Q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] Arrn1 = new int[n1];
        int[] Arrn2 = new int[n2];
        for (int i=0;i<n1;i++)Arrn1[i] = sc.nextInt();
        for (int i=0;i<n2;i++)Arrn2[i] = sc.nextInt();

        int count=0;String str="";
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                if (Arrn1[i]==Arrn2[j]){
                    count++;
                    str += Arrn1[i]+" ";
                    break;
                }
            }
        }
        String[] data = str.split(" ");
        for (int i=0;i<data.length;i++){
            for (int j=1;j<data.length;j++){
                if (data[i]==data[j])count-=1;
            }
        }
        System.out.println(count);
    }
}
