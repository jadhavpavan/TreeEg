import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int array[]= {22,12,56,76,34,19,1,7};
			
			
			for(int i=0;i<array.length;i++) {
				System.out.println("Array - "+array[i]);
			}
			System.out.println("===============================================================");
			Arrays.sort(array);
			System.out.println("Sorted array - ");
			
			for(int i=0;i<array.length;i++) {
				System.out.println("Array - "+array[i]);
			}
			System.out.println("===============================================================");
			
			int data=MyIOService.getInteger("Enter data to search : ");
			
			
			
			
			int first=0;
			int last=array.length-1;
			int mid=(first+last)/2;
			
			
			while(first <= last) {
				if(array[mid] < data) {
						first = mid + 1;
				}
				else if(array[mid] == data) {
					System.out.println(data+" found at array index "+mid);
					break;
				}
				else {
					last=mid-1;
				}
				mid=(first+last)/2;
			}
		if(first > last) {
			System.out.println("Item not found......!");
		}
	}

}



class MyIOService
{
	public static int getInteger(String msgToPrint) {
		System.out.println(msgToPrint);
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		return temp;
	}
}