import java.util.*;

class Time 
{
    int h;
    int m;
    int s;

    public void display() 
    {
        System.out.println(h + ":" + m + ":" + s);
    }

    public Time() 
    {
        h = 0;
        m = 0;
        s = 0;
    }

    public Time(int n) 
    {
        h = n;
        m = n;
        s = n;
    }

    public Time(int n, int n2) 
    {
        h = n;
        m = n2;
        s = 0;
    }

    public Time(int n, int n2, int n3) 
    {
        h = n;
        m = n2;
        s = n3;
    }

    public static void main(String[] arrstring) 
    {
        Time time1 = new Time();
        time1.display();
        Time time2 = new Time(6);
        time2.display();
        Time time3 = new Time(3,12);
        time3.display();
        Time time4 = new Time(9,43,51);
        time4.display();
    }
}