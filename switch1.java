// switch the number in output
import java.util.*;
public class switch1 {
    public static void main(String[] args) {
        int num = 10;
        //switch expression
        switch (num) {
            case 1:
                System.out.println("10");
                break;
            case 10:
                System.out.println("12");
                break;
            case 12:
                System.out.println("15");
                break;
            case 15:
                System.out.println("20");
                break;
            //default case statement
            default:
                System.out.println("number is not within the range");

        }
    }
}
