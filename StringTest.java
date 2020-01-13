public class StringTest {

	static int x = 10;

	public static void main(String[] args) {

		TestStatic test = null;
		test.abc();
		System.out.println(mainCopy().x);
		;
	}

	public static StringTest mainCopy() {
		System.out.println("mainCopy() called");
		return null;
	}

}
