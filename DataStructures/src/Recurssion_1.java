
public class Recurssion_1 {

	static int[] arr= {23,12,45,56,78,99};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int Sum=SumofDigits(arr.length-1);
System.out.println(Sum);
	}
	private static int SumofDigits(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return arr[n];
		
		return arr[n]+SumofDigits(n-1);
	}

}
