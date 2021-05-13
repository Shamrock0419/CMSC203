public class Function3 extends Function {

	@Override
	public double fnValue(double x) {
		double distance;
		distance = Math.sqrt(Math.pow(x, 4) - Math.pow(x,2) + 1);
		distance = Math.round(distance * 100.0) / 100.0;
		return distance;
	}
	
	public String toString () {
		String str1 = "Find thr minimum distance between the function f(x) = x^2 and the point (0,1)"
				+ "this distance is described by the function d(x)=sqrt(x^4 - x^2 + 1) ";
		return str1;
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		String str2 = " The closest point P on the Parabola with distance " + x + " from the point is " + optVal;
		return str2;
	}

	@Override
	public double getXVal(double x) {
		
		return x;
	}

	@Override
	public double getYVal(double x) {
		
		return x;
	}

	@Override
	public double getZVal(double x) {
		
		return x;
	}

}