public class Function2 extends Function {

	public double fnValue(double x) {
		double time;
		time = (x/3) + 2 * Math.sqrt(Math.pow(x, 2) - 8 * x + 25);
		time = Math.round(time * 100.0) / 100.0;
		return time;
	}
	public String toString() {
		String rtnString = "Minimize the distance a dog will run and swim to retrie e a ball in the ocean.";
		return rtnString;
	}
	public String answerString(double optVal, double x, double y, double z) {
	String str = "Minimum distance is " + optVal;
		return str;
	}
	
	public double getXVal(double x) {
		x = (280 - Math.sqrt(Math.pow(-280, 2) - 4 * 35 * 551)) / (2*35);
		x = Math.round(x * 100.0) / 100.0;
		return x;
	}
	
	public double getYVal(double x) {
		return x;
	}
	
	public double getZVal(double x) {
		return x;
	}
	

}