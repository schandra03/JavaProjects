
public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int temp, a[] = { 12, 22, 10, 33, 30, 21, 11 };

		for (int i = 0; i < (a.length - 1); i++) {
			if (a[i] > a[i + 1]) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;

				for (int j = i; j > 0; j--) {
					if (a[j] < a[j - 1]) {
						temp = a[j];
						a[j] = a[j - 1];
						a[j - 1] = temp;
					}
				}
			}
		}
		for (int k : a) {
			System.out.println(k);
		}
	}
}
