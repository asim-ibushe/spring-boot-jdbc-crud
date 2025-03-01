import java.lang.*;
import java.util.*;
public class MyString {
    String demo;//characteristic
    MyString(String str)//parameterized
    {
        this.demo=str;
    }
     void revString()//behaviour
    {
        char arr[]=this.demo.toCharArray();//string -> to character array
        for(int i=0,j=(arr.length-1);i<j;i++,j--)
        {
            char temp=arr[i];
            arr[voidi]=arr[j];
            arr[j]=temp;
        }
        //
        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        MyString obj=new MyString("SADIYA");
        obj.revString();   
    }
}
