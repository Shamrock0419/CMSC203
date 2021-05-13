public class Function1 extends Function {
	
	public double fnValue(double x) {
		double value;
		value = 0.8 * Math.PI * Math.pow(x, 2) + (800/x);
		value = Math.round(value * 100.0) / 100.0; 
		return value;
	}
	
	public String toString() {
		String rtnString = "Minimize the cost of a can that will hold 2 liters of liquid";
		return rtnString;
	}

	public String answerString(double cost, double radius, double height, double z) {
	String str = "Minimum cost is $" + cost + "with height " + height + "cm and raius = " + radius + "cm.";
		return str;
	}
	
	public double getXVal(double x) {
		x = Math.cbrt(500/Math.PI);
		x = Math.round(x * 100.0) / 100.0;
		return x;
	}
	
	public double getYVal(double x) {
		double y = 2000 / (Math.PI * Math.pow(x,  2));
		y = Math.round(y * 100.0) / 100.0;
		return y;
	}
	
	public double getZVal(double x) {
		return -1.0;
	}
	

}
