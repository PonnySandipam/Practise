package sdetPrograms;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {56,34,57,88,99};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
	{
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		}
		
		System.out.println("Largest Number in array is"+max);
	}

}
