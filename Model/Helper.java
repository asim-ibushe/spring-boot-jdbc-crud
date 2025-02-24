import java.util.*;
class Numbers
{
    int no;
    Numbers(int num)
    {
        this.no=num;
    }

    long calFactorial()
    {
        int fact=1;
        for(int i=1;i<=this.no;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    void fibSeries()
    {
        int first=0;
        int second=1;
        int third=first+second;
        while(first<=this.no)
        {
            System.out.println(first+" ");
            third=first+second;
            first=second;
            second=third;
        }
    }

    int NOD(int no)
    {

        int cnt=0;
        int temp=no;
        while(temp!=0)
        {
            cnt++;
            temp=temp/10;
        }
        return cnt;
    }

    boolean isArmstrong()
    {
        int temp=this.no;
        int digi=0,sum=0;
        int Mult=1;
        while (temp!=0)
        {
            digi=temp%10;
            Mult=1;//always remember to reset value of multi to 1
            for(int i=1;i<=NOD(this.no);i++)
            {
                Mult=Mult*digi;
            }
            sum+=Mult;
            temp=temp/10;
        }
        System.out.println(sum);
        return this.no==sum;
    }
}

public class Helper {

    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int no=sobj.nextInt();
        Numbers fobj=new Numbers(no);
        System.out.println("Fact is equal to: "+ fobj.calFactorial());
        fobj.fibSeries();
        if(fobj.isArmstrong())
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
        sobj.close();
    }
}