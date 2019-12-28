import java.util.Scanner;

public class M3Q28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(m,n));
    }
    public static int power(int a,int b){
        int t = Math.max(a,b);
        int p = Math.min(a,b);
        if (t%p==0)return p;
        else return power(t%p,p);
    }
}
