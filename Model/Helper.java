import java.util.*;
class Numbers
{
    int no=0;
    Numbers(int num)
    {
        this.no=num;
    }

    int calFactorial()
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

    int NOD()
    {

        int cnt=0;
        int temp=this.no;
        while(temp!=0)
        {
            cnt++;
            temp=temp/10;
        }
        return cnt;
    }
}

public class Helper {

    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int no=sobj.nextInt();
        Numbers fobj=new Numbers(no);
        System.out.println("Fact is equal to: "+ fobj.calFactorial());
        fobj.fibSeries();
        System.out.println("No of Digi are "+fobj.NOD());
        sobj.close();
    }
}