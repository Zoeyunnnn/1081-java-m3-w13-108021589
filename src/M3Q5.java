import java.util.Scanner;

public class M3Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(fun(m)/(fun(n)*fun(m-n)));
    }
    public static long fun(int x){
        long a = 1;
        for (int i=x;i>1;i--){
            a*=i;
        }
        return a;
    }
}
