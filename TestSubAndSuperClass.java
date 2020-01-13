
public class TestSubAndSuperClass {

	public TestSubAndSuperClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//SubClass subClass = (SubClass) new SuperClass();
		SuperClass obj = new SubClass();
		SubClass obj2 = (SubClass) obj;
		obj2.subClass();
	}

}
