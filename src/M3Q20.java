import java.util.Scanner;

public class M3Q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] upC = new int[26];
        int[] lowC = new int[26];
        int count=1;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)-'a'>=0 && str.charAt(i)-'a'<26){
               lowC[str.charAt(i)-'a']++;
            }else if (str.charAt(i)-'A'>=0 && str.charAt(i)-'A'<26){
                upC[str.charAt(i)-'A']++;
            }else if (str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
        for (int i=0;i<26;i++){
            if (lowC[i] != 0) System.out.println((char)('a'+i)+"="+lowC[i]);
        }for (int i=0;i<26;i++){
            if (upC[i] != 0) System.out.println((char)('A'+i)+"="+upC[i]);
        }
    }
}
