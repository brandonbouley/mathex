//brandon bouley 3B :-)
public class MathEx {

    private static int swap(int x) {

        int a=(x%10);
        int b=(x%100)/10;
        int c=(x%1000)/100; //isolate the digits in terms of ones

        a*=10;
        c*=100; //convert the digit from the ones to tens, and from ones to hundreds

        return a+b+c; //put frankenstein's number back together
    }
    private static int timeLeft(int curHour, int curMin, int depHour, int depMin) {

        curHour *= 60; // convert hours into minutes
        depHour *= 60;

        int curHourMin = curHour + curMin;  //combine hours and minutes into one big amount of minutes
        int depHourMin = depHour + depMin;

        int remTime = depHourMin - curHourMin; //total minutes remaining

        int remHour = remTime / 60; // hours left can be found with int. division. minutes left can be found with the remainder.
        int remMin = remTime % 60;

        System.out.println("You have " + remHour + " hours and " + remMin + " minutes remaining.");

        return 0;
    }
    private static int dayOfWeek(int FoM, int date) {

        int DoW=(date%7)-(1-FoM); //it's 1 am a day (i guess 2) after im supposed to hand this in so i'm taking the L on this one
                    // :(
        System.out.println(DoW);

        return 0;

        }

    public static void main(String[] args) {
        int a=swap(123);
        int b=swap(456);
        int c=swap(789);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        timeLeft(2,0,3,0);
        timeLeft(4,30,11,15);
        timeLeft(5, 11, 7, 3);

        System.out.println(" ");

        int g=dayOfWeek(1,5);
        int h=dayOfWeek(4,6);
        int j=dayOfWeek(3,7);
    }}
/* 132
465
798
You have 1 hours and 0 minutes remaining.
You have 6 hours and 45 minutes remaining.
You have 1 hours and 52 minutes remaining.

5
9
2

Process finished with exit code 0   */