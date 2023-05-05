package sdetPrograms;
import java.util.*;

public class DuplicateNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {77,56,88,23,89,77,23};
		boolean flag=false;
		HashSet<Integer> hashset = new HashSet();
		
		for(int i : arr) {
			
			if(hashset.add(i)==false) {
				System.out.println("Found Duplicate Element"+i);
				flag=true;
			}
		
			
		}
		if(flag=false)
			System.out.println("No  Duplicate ElementFound");
	}

}
