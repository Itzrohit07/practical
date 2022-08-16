public class arithmetic {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c=30;

        //arithmetic operator
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a % b);

        System.out.println(a<b && b<a);//logical operator
        System.out.println(a>b && b>a);//logical operator
        System.out.println(a>b||b>a);//logical operator
        System.out.println(b==c);//relational operator

        System.out.println(a++ + ++a);//prefix and postfix
        System.out.println(b-- + --b);

        System.out.println(a<b);//relational operator
        System.out.println(a>b);//relational operator


    }
}
