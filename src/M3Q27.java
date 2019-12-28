import java.util.Scanner;

public class M3Q27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(fun(n));
    }
    public static int fun(long x){
        if (x<10) return 1;
        else return 1+fun((long) x/10);
    }
}
