import java.util.ArrayList;

public class ArrayMax {

	public ArrayMax() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 900, 100, 11 };
		int max = a[0];
		
		for(int i =0 ;  i < (a.length-1);i++) {
			if(a[i] > max) {
				max  = a[i];
			} 
		}
		System.out.println(max);		
	}

}
