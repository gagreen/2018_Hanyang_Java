public class Son extends Father {
	public Son() {
		System.out.println("아들임");
	}
	public Son(int i) {
		super(i);
		System.out.println("인자 받은 아들");
	}
	public void print() {
		System.out.println("아빠 자?");
	}
}
