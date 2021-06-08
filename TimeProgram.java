import java.util.*;

class TimeProgram 
{
    int hour;
    int min;
    int sec;

    public TimeProgram() 
    {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    public TimeProgram(int n, int n2, int n3) 
    {
        this.hour = n;
        this.min = n2;
        this.sec = n3;
    }

    public TimeProgram(int n) 
    {
        this.hour = n / 3600;
        this.min = n / 60;
        this.sec = Math.round(((float)n / 60.0f - (float)this.min) * 60.0f);
    }

    void display() 
    {
        System.out.println(this.hour + ":" + this.min + ":" + this.sec);
    }

    public static void main(String[] arrstring) 
    {
        TimeProgram t1 = new TimeProgram();
        TimeProgram t2 = new TimeProgram(1, 20, 55);
        TimeProgram t3 = new TimeProgram(3250);
        t1.display();
        t2.display();
        t3.display();
    }
}