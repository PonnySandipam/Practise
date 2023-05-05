package javaBasicPrograms;

public class Reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="The Sky is Blue";

String[] arr=str.split(" ");
for (int i=arr.length-1;i>=0;i--) {
	 System.out.print(arr[i]+" ");
}
	}

}
