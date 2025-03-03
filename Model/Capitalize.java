class Demo {

    String var;
    Demo(String str)
    {
        this.var=str;//instance variable initialize
    }
    /// my name is sadiya-> My Name Is Sadiya
    void capitalizeString()
    {
        //ascii value, unique integer number
        char arr[]=this.var.toCharArray();
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            //Asim Arif Ibushe

            if(flag==false && (arr[i]>='a') && (arr[i]<='z'))//if false and already capital
            {
                arr[i]=(char) (arr[i]-32);
                flag=true;
            }
            if (arr[i]==' ') {
                flag=false;
            }
        }
        System.out.println(new String(arr));
    }

}

public class Capitalize {
    public static void main(String[] args) {

       Demo  dobj=new Demo("my name is sadiya, i am a good girl");
       dobj.capitalizeString();
    }    
}
