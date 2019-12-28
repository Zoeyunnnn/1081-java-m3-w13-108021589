import java.util.Scanner;

public class M3Q22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int[] va = new int[n];

        for (int i=0;i<n;i++) data[i] = sc.nextInt();
        for (int i=0;i<n;i++){
            int v=0;
            int k=data[i];
            while (k>0){
                v += k%10;
                k /= 10;
            }va[i] = v;
        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (va[i]>va[j]){
                    int tmp = va[i];
                    va[i] = va[j];
                    va[j] = tmp;
                    int tnp = data[i];
                    data[i] = data[j];
                    data[j] = tnp;
                }if (va[i]==va[j]){
                    if (data[i]>data[j]){
                        int tnp = data[i];
                        data[i] = data[j];
                        data[j] = tnp;
                    }else {
                        int tnp = data[j];
                        data[j] = data[i];
                        data[i] = tnp;
                    }
                }
            }
        }
        for (int i=0;i<n;i++) System.out.print(data[i]+"\t");
        System.out.println();
    }
}
