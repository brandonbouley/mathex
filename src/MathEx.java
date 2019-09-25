
public class MathEx {

    public static int swap(int x) {

        int a=(x%10);
        int b=(x%100)/10;
        int c=(x%1000)/100; //isolate the digits in terms of ones

        a*=10;
        c*=100; //convert the digit from the ones to tens and from ones to hundreds
        int d= a+b+c; //put frankenstein's number back together

        return d;
    }

    public static int timeLeft(double r, int curMin, int depHour, int depMin) {
        double curHour = ;
        int b = depHour + 12;
        int remHour = b - a;
        System.out.println(remHour);


        return 0;

    }

    public static void main(String[] args) {
        int a=swap(123);
        int b=swap(456);
        int c=swap(789);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int d=timeLeft(1,0,11,0);










    }











    }
