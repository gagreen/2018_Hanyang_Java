import java.util.HashSet;

public class Test8 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int count=0;
		while(hs.size()<6) {
			hs.add((int)(Math.random()*45)+1);
			count++;
		}
		System.out.println(hs);
		System.out.println(count);
	}

}
