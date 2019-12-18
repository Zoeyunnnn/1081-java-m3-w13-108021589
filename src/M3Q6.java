import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class M3Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        fun(a);
    }
    public static void fun(String x){
        char[] data = new char[x.length()];
        for (int i=0;i<x.length();i++) {
            data[i] = x.charAt(i);
        }for (int i=0;i<data.length;i++) System.out.print(data[i]+"\t");
        System.out.println();
    }
}
