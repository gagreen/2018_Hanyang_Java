public class AnimalTest {

	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		a[0]= new Dog();
		a[1]= new Cat();
		a[2]= new Bear();
		for(int i=0; i<a.length; i++) {
			a[i].wow();
		}

	}

}
