package javaBasicPrograms;

public class MaxndMinChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String Str="aaabbcccdddd";
 int[] freq=new int[Str.length()];
 int min,max,i,j;
 char MaxChar=Str.charAt(0);
 char MinChar=Str.charAt(0);
 
 char str1[] = Str.toCharArray();    
 
 for(i=0;i<str1.length;i++) {
	 
	 freq[i]=1;
	
	 for(j=i+1;j<str1.length;j++) {
		
		 if(str1[i]==str1[j]&&str1[i]!='0'&&str1[i]!=' ') {
			 freq[i]++;
			str1[j]='0';
		 }
	 }
	 
 	 
 }
 
 min=max=freq[0];
 for(i=0;i<freq.length;i++) {
	
	 if(min>freq[i]&&freq[i]!=0) {
 		 min=freq[i];
MinChar=str1[i];
}
 
	 
	 if(max<freq[i]) {
		 max=freq[i];
		 MaxChar=str1[i];
	 }
	 
 }
 
 System.out.println("Maximum Occured Character is:"+ MaxChar+" its frquency is "+max);
 System.out.println("Minimum Occured Character is:"+ MinChar+" its frquency is "+min);
 
	}

}
