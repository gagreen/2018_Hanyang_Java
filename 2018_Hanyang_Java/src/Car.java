public class Car {
	Engine e;
	String name;
	public void EngineInfo() {
		System.out.println(this.name+":"+e.info());
	}
	public Car(String name, int maxSpeed, int zeroBack) {
		this.name = name;
		e = new Engine( maxSpeed, zeroBack);
	}
}
