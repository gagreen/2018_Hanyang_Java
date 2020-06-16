public class Test3 {

	public static void main(String[] args) {
		Kim y1 = new Kim();
		Kim y2 = new Kim();
		//y1.height= 180;
		//y1.weight= 80;
		y1.setHeight(180);
		y1.setWeight(80);
		
		y2.setHeight(170);
		y2.setWeight(70);
		
		System.out.println("키 "+y1.getHeight()+"cm, 무게 "+y1.getWeight()+"kg.");
		System.out.println("키 "+y2.getHeight()+"cm, 무게 "+y2.getWeight()+"kg.");
	}

}
