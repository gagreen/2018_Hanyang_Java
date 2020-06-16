public class Engine {
		int maxSpeed;
		int zeroBack;
		
		public Engine(int maxSpeed, int zeroBack) {
			this.maxSpeed = maxSpeed;
			this.zeroBack = zeroBack;
		
	}
	public String info() {
		return maxSpeed+"("+zeroBack+")";
	}
}
