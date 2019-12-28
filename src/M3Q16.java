import java.util.Scanner;

public class M3Q16 {
    public static void main(String[] args) {

/*二維方法*/
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] ch = n.toCharArray();
        String[] tmp = {"","","","",""};

        int m=0;
        while (m<n.length()){
            switch (ch[m]){
                case '0':
                    m++;
                    tmp[0] += "*****";
                    tmp[1] += "*   *";
                    tmp[2] += "*   *";
                    tmp[3] += "*   *";
                    tmp[4] += "*****";
                    break;
                case '1':
                    m++;
                    tmp[0] += "    *";
                    tmp[1] += "    *";
                    tmp[2] += "    *";
                    tmp[3] += "    *";
                    tmp[4] += "    *";
                    break;
                case '2':
                    m++;
                    tmp[0] += "*****";
                    tmp[1] += "    *";
                    tmp[2] += "*****";
                    tmp[3] += "*    ";
                    tmp[4] += "*****";
                    break;
                case '3':
                    m++;
                    tmp[0] += "*****";
                    tmp[1] += "    *";
                    tmp[2] += "*****";
                    tmp[3] += "    *";
                    tmp[4] += "*****";
                    break;
                case '4':
                    m++;
                    tmp[0] += "*   *";
                    tmp[1] += "*   *";
                    tmp[2] += "*****";
                    tmp[3] += "    *";
                    tmp[4] += "    *";
                    break;
                case '5':
                    m++;
                    tmp[0] += "*****";
                    tmp[1] += "*    ";
                    tmp[2] += "*****";
                    tmp[3] += "    *";
                    tmp[4] += "*****";
                    break;
                case '6':
                    m++;
                    tmp[0] += "*    ";
                    tmp[1] += "*    ";
                    tmp[2] += "*****";
                    tmp[3] += "*   *";
                    tmp[4] += "*****";
                    break;
                case '7':
                    m++;
                    tmp[0] += "*****";
                    tmp[1] += "    *";
                    tmp[2] += "    *";
                    tmp[3] += "    *";
                    tmp[4] += "    *";
                    break;
                case '8':
                    m++;
                    tmp[0] += "*****";
                    tmp[1] += "*   *";
                    tmp[2] += "*****";
                    tmp[3] += "*   *";
                    tmp[4] += "*****";
                    break;
                case '9':
                    m++;
                    tmp[0] += "*****";
                    tmp[1] += "*   *";
                    tmp[2] += "*****";
                    tmp[3] += "    *";
                    tmp[4] += "*****";
                    break;
                default:
                    break;
            }
            tmp[0] += " ";
            tmp[1] += " ";
            tmp[2] += " ";
            tmp[3] += " ";
            tmp[4] += " ";
        }for (int i=0;i<5;i++) System.out.println(tmp[i]);

/*一維方法*/
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] data = new int[4];
//        for (int i=3;i>=0;i--){
//            data[i] = n%10;
//            n /= 10;
//        }
//
//        int m=0;
//        while (m<5){
//            switch (m){
//                case 0:
//                    for (int k=0;k<4;k++){
//                        if (data[k]==1) System.out.print("    * ");
//                        else if (data[k]==4) System.out.print("*   * ");
//                        else if (data[k]==6) System.out.print("*     ");
//                        else System.out.print("***** ");}
//                    System.out.println();
//                    break;
//                case 1:
//                    for (int k=0;k<4;k++){
//                        if (data[k]==1) System.out.print("    * ");
//                        else if (data[k]==2 || data[k]==3 || data[k]==7)
//                            System.out.print("    * ");
//                        else if (data[k]==5 || data[k]==6)
//                            System.out.print("*     ");
//                        else System.out.print("*   * ");}
//                    System.out.println();
//                    break;
//                case 2:
//                    for (int k=0;k<4;k++){
//                        if (data[k]==1) System.out.print("    * ");
//                        else if (data[k]==0) System.out.print("*   * ");
//                        else if (data[k]==7) System.out.print("    * ");
//                        else System.out.print("***** ");}
//                    System.out.println();
//                    break;
//                case 3:
//                    for (int k=0;k<4;k++){
//                        if (data[k]==1) System.out.print("    * ");
//                        else if (data[k]==0 || data[k]==6 || data[k]==8)
//                            System.out.print("*   * ");
//                        else if (data[k]==2) System.out.print("*     ");
//                        else System.out.print("    * ");}
//                    System.out.println();
//                    break;
//                case 4:
//                    for (int k=0;k<4;k++){
//                        if (data[k]==1) System.out.print("    * ");
//                        else if (data[k]==4 || data[k]==7 || data[k]==9)
//                            System.out.print("    * ");
//                        else System.out.print("***** ");}
//                    System.out.println();
//                    break;
//            }m++;
//        }
    }
}
