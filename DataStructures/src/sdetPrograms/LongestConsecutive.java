package sdetPrograms;

public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i=99,count=0;
 

	while(i!=0) {
				i=(i & (i<<1));
				System.out.println((i & (i<<1)));
		 count++;
	}


System.out.println(count);
	}

}
