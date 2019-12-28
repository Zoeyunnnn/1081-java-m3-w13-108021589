import java.util.Scanner;

public class M3Q29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fun(n));
    }
    public static int fun(int x){
        if (x==0 || x==1){return x;}
        else {return fun(x-1)+fun(x-2);}
    }
}
