import java.util.Scanner;

public class M3Q23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        int j=0;
        for (int i=2;i<n;i++){
            if (isPrim(i)){
                data[j]=i;
                j++;
            }
        }
        for (int i=0;i<j;i++){
            for (int k=i+1;k<j;k++){
                if (data[i]+data[k]==n){
                    System.out.println(data[i]+"+"+data[k]);
                }
            }
        }
    }
    public static boolean isPrim(int x){
        boolean flag = true;
        int i=2;
        while (i<x/2){
            if (x%i==0){
                flag = false;
            }i++;
        }return flag;
    }
}
