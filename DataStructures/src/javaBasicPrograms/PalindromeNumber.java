package javaBasicPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=121897;

int res=0;
 while(n!=0) {
res=res*10+n%10;
n=n/10;
	}
 System.out.println(res);
	}
}
