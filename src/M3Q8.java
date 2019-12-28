import java.util.Scanner;

public class M3Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        int[] data = new int[str.length];
        for (int i=0;i<str.length;i++) data[i] = Integer.parseInt(str[i]);

        square(data);
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        }
        System.out.println();
    }
    public static void square(int[] x){
        for (int i=0;i<x.length;i++){
            x[i] *= x[i];
        }
    }
}
