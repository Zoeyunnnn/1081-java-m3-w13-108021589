import java.util.Scanner;

public class M3Q26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(a,n));
        System.out.println(powerr(a,n));
    }
    public static long power(int b,int m){
        if (m==1)return b;
        else return b*power(b,m-1);
    }
    public static long powerr(int c,int t){
        if (t==1)return c;
        else if (t%2==0) return powerr(c,t/2)*powerr(c,t/2);
        else return c*powerr(c,t-1);
    }
}
