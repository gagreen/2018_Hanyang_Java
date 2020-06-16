class MyTest {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(String a, String b) {
		System.out.println(a+b);
	}
public class OverloadingTest {

}
	public static void main(String[] args) {
		MyTest mt = new MyTest();
		mt.add(5, 4);
		mt.add("a", "b");

	}

}
