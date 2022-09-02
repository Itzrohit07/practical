package testprogram;

public class Swithday {
   //switch case example
	
	public static void main(String[] args) {
	
     int day=7;
     String daystring=" ";
     switch(day) {
     
     case 1:daystring="1-sunday";
     break;
     case 2:daystring="2-mon";
     break;
     case 3:daystring="3-tue";
     break;
     case 4:daystring="4-thur";
     break;
     case 5:daystring="5-fri";
     break;
     case 6:daystring="6-satur";
     break;
     case 7:daystring="7-sun";
     break;
     
     default:System.out.println("your number is invalid");
     System.out.println("daystring");
     }
     
	}

}
