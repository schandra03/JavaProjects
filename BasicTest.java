
public class BasicTest {

	public BasicTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		test(a);
		/*
		 * int n = 10; for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++)
		 * { System.out.print("*"); } System.out.println(); }
		 */
	}

	public static void test(int a[]) {
		int lengthOfA = a.length - 1;
		int start = 0;

		while (start < lengthOfA) {
			System.out.println(a[start]);
			start++;
			System.out.println(a[lengthOfA]);
			lengthOfA--;
		}

		if (start == lengthOfA) {
			System.out.println(a[start]);
		}
	}

}
