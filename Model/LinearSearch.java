import java.util.Scanner;

public class LinearSearch {
    //universal, can be used by other member in industry, reusability
    boolean search(int arr[],int Tofind)//to return element present or not
    {
        for(int i=0;i<arr.length;i++)//travel whole array
        {
            if(arr[i]==Tofind)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner sobj=new Scanner(System.in);//resource
        int size=sobj.nextInt();
        int arr[]=new int[size];//dynamic memory allocation
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)// from 0 index to size-1, user input
        {
            arr[i]=sobj.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("Element "+i+" "+arr[i]);
        }

        LinearSearch obj=new LinearSearch();
        if(obj.search(arr,55))
        {
            //condition one, when element found
            System.out.println("Element Present");
        }
        else
        {
            //condition second, not found
            System.out.println("Element Not Present");
        }
    }
}
