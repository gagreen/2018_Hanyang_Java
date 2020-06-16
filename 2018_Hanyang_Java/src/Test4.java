public class Test4 {

	public static void main(String[] args) {
		String s1 = "안녕";
		String s2 = "안녕";
		String s3 = new String("안녕");
		String s4 = new String("안녕");
		
		if(s1==s2) System.out.println("1");
		if(s3==s4) System.out.println("2");
		if(s3.equals(s4)) System.out.println("3");
		

	}

}
