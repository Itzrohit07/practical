//using switch case this is vowel or consonant.
import java.util.Scanner;
public class Switchvowel {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

       char ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(" this is vowel");
                break;
            default:
                System.out.println("this is consonant");

        }

    }
}
