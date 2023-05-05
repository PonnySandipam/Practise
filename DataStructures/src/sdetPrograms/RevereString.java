package sdetPrograms;

public class RevereString {

	

	public String reverseString(String Str) {
		StringBuilder reverstr=new StringBuilder();
		
		for(int i=Str.length()-1;i>=0;i--) {
			 reverstr.append(String.valueOf(Str.charAt(i)));
					}
		return reverstr.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name="Hi I am Ponny";
		RevereString Rs= new RevereString();
			System.out.println(Rs.reverseString(Name));
		
	}

}
