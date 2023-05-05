package sdetPrograms;

public class PrintEvenNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {56,66,77,43,42};
  for(int i=0;i<arr.length;i++) {
	 if(arr[i]==0) {
		 System.out.println("0 is neither even or odd");
	 }
	 
	 if(arr[i]%2==0) {
		 
		 System.out.println(arr[i]);
	 }
 }
 
	}
}
