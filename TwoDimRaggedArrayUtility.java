import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	public TwoDimRaggedArrayUtility() {
		
	}
	
	public static double[][] readFile (File file) throws FileNotFoundException {
		int row = 0;
		String[] txt;
		double[][] data = null;
		Scanner rdr = new Scanner(file);
		
		while (rdr.hasNextLine()) {
			rdr.nextLine();
			row++;
		}
		data = new double[row][];
		rdr.close();
		rdr = new Scanner(file);
		for (int i = 0; i < row; i++) {
			txt = rdr.nextLine().split(" ");
			data[i] = new double[txt.length];
			for (int k = 0; k < txt.length; k++) {
				data[i][k] = Double.valueOf(txt[k]);
			}
		}
		rdr.close();
		return data;
	}
	
	public static void writeToFile (double[][] data, java.io.File file) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(file);
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				writer.print(data[i][k] + " ");
			}
			writer.println();
		}
		writer.close();
	}
	
	public static double getTotal (double[][] data) {
		double total;
		total = 0;
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				total += data[i][k];
			}
		}
		return total;
	}
	
	public static double getAverage(double[][] data) {
		double total = 0;
		double avg = 0;
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				total += data[i][k];
				counter++;
			}
		}
		avg = total / counter;
		return avg;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double total;
		total = 0;
		for (int i = 0; i < data[row].length; i++) {
			total += data[row][i];
		}
		return total;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double total;
		total = 0;
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				total += data[i][col];
			}
		}
		return total;
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		double highest;
		highest = data[row][0];
		
		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] > highest) {
				highest = data[row][i];
			}
		}
		return highest;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double lowest;
		lowest = data[row][0];
		
		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] < lowest) {
				lowest = data[row][i];
			}
		}
		return lowest;
	}
	
	public static double getHighestInRowIndex(double[][] data, int row) {
		double highest;
		highest = data[row][0];
		int index = 0;
		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] > highest) {
				highest = data[row][i];
				index = i;
			}
		}
		return index;
	}
	public static double getLowestInRowIndex(double[][] data, int row) {
		double lowest;
		lowest = data[row][0];
		int index = 0;
		
		for (int i = 0; i < data[row].length; i++) {
			if (data[row][i] < lowest) {
				lowest = data[row][i];
				index = i;
			}
		}
		return index;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
		int fIndex = 0;
		boolean flag;
		flag = false;
		for (int i = 0; flag == false; i++) {
			if (col < data[i].length) {
				fIndex = i;
				flag = true;
			}
		}
		double highest;
		highest = data[fIndex][col];
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				if (data[i][col] > highest) {
					highest = data[i][col];
				}
			}
		}
		return highest;
	}
	
	public static double getLowestInColumn(double[][] data, int col) {
		int fIndex = 0;
		boolean flag;
		flag = false;
		for (int i = 0; flag == false; i++) {
			if (col < data[i].length) {
				fIndex = i;
				flag = true;
			}
		}
		double lowest;
		lowest = data[fIndex][col];
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				if (data[i][col] < lowest) {
					lowest = data[i][col];
				}
			}
		}
		return lowest;
	}
	
public static double getHighestInColumnIndex(double[][] data, int col) {
		int fIndex;
		fIndex = 0;
		boolean flag = false;
		for (int i = 0; flag == false; i++) {
			if (col < data[i].length) {
				fIndex = i;
				flag = true;
			}
		}
		double highest;
		highest = data[fIndex][col];
		int index = 0;
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				if (data[i][col] > highest) {
					highest = data[i][col];
					index = i;
				}
			}
		}
		return index;
	}

public static double getLowestInColumnIndex(double[][] data, int col) {
	int fIndex;
	fIndex = 0;
	boolean flag = false;
	for (int i = 0; flag == false; i++) {
		if (col < data[i].length) {
			fIndex = i;
			flag = true;
		}
	}
	double lowest;
	lowest = data[fIndex][col];
	int index = 0;
	for (int i = 0; i < data.length; i++) {
		if (col < data[i].length) {
			if (data[i][col] < lowest) {
				lowest = data[i][col];
				index = i;
				}
			}
		}
	return index;
	}

	public static double getHighestInArray(double[][] data) {
		double arrHighest;
		arrHighest = data[0][0];
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				if (data[i][k] > arrHighest) {
					arrHighest = data[i][k];
				}
			}
		}
		return arrHighest;
	}
	
public static double getLowestInArray(double[][] data) {
	double arrLowest;
	arrLowest = data[0][0];
	for (int i = 0; i < data.length; i++) {
		for (int k = 0; k < data[i].length; k++) {
			if (data[i][k] < arrLowest) {
				arrLowest = data[i][k];
			}
		}
	}
	return arrLowest;
	}
}














