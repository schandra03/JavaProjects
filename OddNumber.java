
public class OddNumber {

	public OddNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 900, 100, 11 };
		/*
		 * for(int i =0 ; i < (a.length-1);i++) { if(a[i]%2 != 0)
		 * System.out.println(a[i]); }
		 * 
		 * int sum = 0; for(int i =0 ; i < (a.length-1);i++) { sum = sum + a[i];
		 * } System.out.println(sum);
		 */

		/*
		 * for(int i =0 ; i < (a.length-1);i++) { if(i%2 != 0)
		 * System.out.println(a[i]); }
		 */

		int length = a.length - 1;
		int j = 0, temp;
		while (j < length) {
			/*temp = a[length];
			a[length] = a[j];
			a[j] = temp;*/
			
			a[length] = a[length] + a[j];
			a[j] = a[length] - a[j];
			a[length] = a[length] - a[j];
			
			length--;
			j++;
		}

		for (int i = 0; i < (a.length - 1); i++) {
			System.out.println(a[i]);
		}

		/*int n = 30, start = 1, space = n;
		for (int i = 0; i < n-1; i++) {
			for (int k = 0; k < space-2; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l < (2*start-1); l++) {
				System.out.print("*");
			}
			start++;
			space--;
			System.out.println("");
		}*/

	}
}
