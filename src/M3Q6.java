import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class M3Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] data = sc.next().toCharArray();

        fun(data);
    }
    public static void fun(char[] x){
        for (int i=0;i<x.length;i++) System.out.print(x[i]+"\t");
        System.out.println();
    }
}
