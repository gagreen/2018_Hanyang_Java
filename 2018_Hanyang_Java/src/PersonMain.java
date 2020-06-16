public class PersonMain {

	public static void main(String[] args) {
		Person yang = new Person(19);
		Person kim = new Person("김민성");
		Person lee = new Person("정호",19);
		Person kang = new Person ();
		
		//yang.setName("마리");
		//yang.setAge(19);
		
		//kim.setName("김철수");
		//kim.setAge(20);
		
		System.out.println("이름:"+yang.getName()+"나이:"+yang.getAge());
		System.out.println("이름:"+kim.getName()+"나이:"+kim.getAge());
		System.out.println("이름:"+lee.getName()+"나이:"+lee.getAge());
		System.out.println("이름:"+kang.getName()+"나이:"+kang.getAge());
		
	}

}
