import java.util.Scanner;

class Search
{
    int arr[],element;
    Search(int size, int element)
    {
        this.arr=new int[size];
        this.element=element;
    }
    
    boolean present()
    {
        int left=0, right=arr.length-1;
        int mid=0;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(arr[mid]==element)
            {
                return true;
            }
            if(element>arr[mid])
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input for array size
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        // Step 2: Take input for the element to search
        System.out.print("Enter element to search: ");
        int element = input.nextInt();

        // Step 3: Create Search object
        Search sobj = new Search(size, element);

        // Step 4: Take input for array elements
        System.out.println("Enter " + size + " sorted array elements:");
        for (int i = 0; i < size; i++) {
            sobj.arr[i] = input.nextInt();
        }

        // Step 5: Call the search method and print result
        if (sobj.present()) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }

    }
    
}
