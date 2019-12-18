import java.util.Scanner;

public class M3Q19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        char[] data = new char[n.length()];
        for (int i=0;i<n.length();i++) data[i] = n.charAt(i);

        int j=data.length-1;
        boolean flag = false;
        for (int i=0;i<data.length;i++){
            if (i==j) break;
            flag = false;
            if (data[i]==data[j]) flag=true;
            j--;
        }
        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
