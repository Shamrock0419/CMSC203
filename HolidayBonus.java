
public class HolidayBonus {

	public HolidayBonus() {
		
	}
	
	public static double[] calculateHolidayBonus (double[][] data, double high, double low, double other) {
		double[] bonus = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				if (data[i][k] == TwoDimRaggedArrayUtility.getHighestInColumn(data,  k) && data[i][k] > 0) {
					bonus[i] += high;
				}
				else if (data[i][k] == TwoDimRaggedArrayUtility.getLowestInColumn(data,  k) && data[i][k] > 0) {
					bonus[i] += low;
				}
				else if (data[i][k] > 0) {
					bonus[i] += other;
				}
				else {
					bonus[i] += 0;
				}
			}
		}
		return bonus;
	}
	public static double calculatetotalHolidayBonus (double[][] data, double high, double low, double other) {
		double total;
		total = 0;
		double[] bonus = calculateHolidayBonus(data, high, low, other);
		for (int i = 0; i < bonus.length; i++) {
			total += bonus[i];
		}
		return total;
	}
}
