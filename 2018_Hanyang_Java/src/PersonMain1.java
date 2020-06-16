public class PersonMain1 {

	public static void main(String[] args) {
		Person[] p = new Person[5];
		for(int i=0;i<p.length;i++) {
			p[i] = new Person("이름"+i ,19);
		}
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].getName()+ " ");
		}
	}

}
