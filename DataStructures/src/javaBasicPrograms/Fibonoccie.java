package javaBasicPrograms;

public class Fibonoccie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,count=10,i,n3;

System.out.print(n1+" "+n2);

for(i=2;i<count;i++) {
	
	n3=n1+n2;
	System.out.print(" "+n3);
	n2=n3;
	n1=n2;
	
}
		}

}
