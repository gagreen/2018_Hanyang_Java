class StaticTest{
	public static void print() {
		System.out.println("hello");
	}
}
public class Test9 {

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.print();
		StaticTest.print();

	}

}
