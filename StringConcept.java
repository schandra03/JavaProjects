public class StringConcept {
		
	static String str1, str2, str3;
	
	
	public static void main(String[] args) {
		str1 = "Shubham";
		str2 = new String("Shubham");
		str3 = "Shubham";
		if(str1.equals(str2)) {
			System.out.println("equals()");
		}
		
		int i = 10;
		int j = 10;
		if(str1 ==  str3) {
			System.out.println("==");
		}
		
		if( i == j) {
			System.out.println("true int");
		}
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
	
	
}
