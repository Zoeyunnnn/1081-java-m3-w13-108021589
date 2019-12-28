import java.util.Scanner;

public class M3Q17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fun(n));
    }
    public static int fun(int x){
        if (x==1) return x+1;
        else return fun(x-1)+fun((int) Math.floor(x/2));
    }
}
