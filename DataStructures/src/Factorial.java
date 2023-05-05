
public class Factorial {

 static	int FactorialNumber = 6;
	
	public static void main(String[] args) {
		 int Value=FactorialRecursion(FactorialNumber);
		System.out.println(Value);
		// TODO Auto-generated method stub

	}
	public static  int FactorialRecursion(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		
		return n*FactorialRecursion(n-1);
	}

}
