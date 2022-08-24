//using switch statement and output in tne program.
import java.util.*;
public class switch2 {
    public static void main(String[] args) {
        int day = 4;

        String daystring="";
        System.out.println("enter a day:"+day);

        switch(day){//Switch statement

            case 1: daystring="1 - mon";
                break;
            case 4: daystring="2 - tue";
                break;
            case 5: daystring="3 - wed";
                break;
            case 3: daystring="4 - thu";
                break;
            case 2: daystring="5 - fri";
                break;
            case 6: daystring="6 - sat";
                break;
            case 7: daystring="7 - sun";
                break;
            default:System.out.println("Invalid day!");
                System.out.println(daystring);

        }
    }
}
