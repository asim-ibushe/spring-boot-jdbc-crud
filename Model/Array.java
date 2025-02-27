class Lucky
{
    
    //default constructor
    Lucky()
    {
        System.out.println("Calling constructor");
    }

    //business logic
    void displayLucky(int arr[])
    {
        for(int i=1;i<(arr.length-1);i++)
        {
         if(arr[i]==arr[i-1]+arr[i+1])
         {
            System.out.println(arr[i]);
         }   
        }
    }

}

public class Array {
    public static void main(String[] args) {
        Lucky lobj=new Lucky();//creating object
        int[] arr = { 1, 3, 2, 4, 5};
        lobj.displayLucky(arr);   
    }
}
