
public class PrintNnumbers {

	//private int n=10;
			
	public static void Printnumber(int n) {
		
		if(n<0)
		{
			System.exit(0);
			
		}
		System.out.print(n+",");
		Printnumber(n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintNnumbers ps = new PrintNnumbers();
		Printnumber(100);
		

	}

}
