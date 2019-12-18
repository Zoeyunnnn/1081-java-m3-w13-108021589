import java.util.Scanner;

public class M3Q18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split(" ");
            int[] data = new int[str.length];
            for (int j = 0; j < str.length; j++) {
                switch (str[j].charAt(0)) {
                    case 'C':
                        data[j] = 0;
                        break;
                    case 'D':
                        data[j] = 13;
                        break;
                    case 'H':
                        data[j] = 26;
                        break;
                    case 'S':
                        data[j] = 39;
                        break;
                }
                data[j] += Integer.parseInt(str[j].substring(1));
            }
            for (int j = 0; j < str.length; j++) {
                for (int t = j + 1; t < str.length; t++) {
                    if (data[j] < data[t]) {
//                        int tmp = data[j];
//                        data[j] = data[t];
//                        data[t] = tmp;
                        String p = str[j];
                        str[j] = str[t];
                        str[t] = p;
                    }
                }
                System.out.print(str[j] + "\t");
            }
            System.out.println();
        }
    }
}
