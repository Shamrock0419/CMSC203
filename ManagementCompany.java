
public class ManagementCompany {

	private String name;
	private String taxID;
	private Property[] properties;
	private double mgmFee;
	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH  = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	
	public ManagementCompany(String name, String taxID, double mgmFee) {
			this.name = name;
			this.taxID = taxID;
			this.mgmFee = mgmFee;
			plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
			properties = new Property[MAX_PROPERTY];
			
	}
		public ManagementCompany() {
			name = "";
			taxID = "";
			plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
			properties = new Property[MAX_PROPERTY];
	}
		public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
			this.name = name;
			this.taxID = taxID;
			this.mgmFee = mgmFee;
			plot = new Plot(x, y, width, depth);
			properties = new Property[MAX_PROPERTY];
		}
		public ManagementCompany(ManagementCompany othCompany) {
			name = othCompany.name;
			taxID = othCompany.taxID;
			mgmFee = othCompany.mgmFee;
			plot = othCompany.plot;
			properties = new Property[MAX_PROPERTY];
		}
		
		public int getMAX_PROPERTY() {
			return MAX_PROPERTY;
		}
		public String getName() {
			return name;
		}
		public Plot getPlot() {
			return plot;
		}	
			
		public int getPropIndex() {
			int c = 0;
			for (int i = 0; i < MAX_PROPERTY; i++) {
				if (properties[i] != null) {
					c++;
				}
			}
			return c;
		}
			
		public boolean overlAPlot(Property property) {
			boolean overlapsAnyPlot;
			overlapsAnyPlot = false;
			for (int i = 0; i < getPropIndex(); i++) {
				overlapsAnyPlot = properties[i].getPlot().overlaps(property.getPlot());
			}
			return overlapsAnyPlot;
		}
		
		public int addProperty(Property property) {
			if (getPropIndex() == MAX_PROPERTY) {
				return -1;
			}
			if (property == null) {
				return -2;
			}
			if (plot.encompasses(property.getPlot()) == false) {
				return -3;
			}
			if (overlAPlot(property) == true) {
				return -4;
			}
			properties[getPropIndex()] = property;
			return getPropIndex() - 1;
		}
		
		public int addProperty(String name, String city, double rentAmount, String owner) {
			Property property = new Property(name, city, rentAmount, owner);
			if (getPropIndex() == MAX_PROPERTY) {
				return -1;
			}
			if (property == null) {
				return -2;
			}
			if (plot.encompasses(property.getPlot()) == false) {
				return -3;
			}
			if (overlAPlot(property) == true) {
				return -4;
			}
			properties[getPropIndex()] = property;
			return getPropIndex() - 1;
		}
		
		public int addProperty(String name, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
			Property property = new Property(name, city, rentAmount, owner, x, y, width, depth);
			if (getPropIndex() == MAX_PROPERTY) {
				return -1;
			}
			if (property == null) {
				return -2;
			}
			if (plot.encompasses(property.getPlot()) == false) {
				return -3;
			}
			if (overlAPlot(property) == true) {
				return -4;
			}
			properties[getPropIndex()] = property;
			return getPropIndex() - 1;
		}
		
		public double totalRent() {
			int totRent = 0;
			for (int i = 0; i < getPropIndex(); i++) {
				totRent += properties[i].getRentAmount();
			}
			return totRent;
		}
		
		public String maxRentProp() {
			Property maxRentProperty = new Property();
			for (int i = 0; i < getPropIndex(); i++) {
				if (maxRentProperty.getRentAmount() < properties[i].getRentAmount()) {
					maxRentProperty = properties[i];
				}
			}
			return maxRentProperty.toString();
		}
		
		public int maxRentPropertyIndex() {
			Property maxRentProperty = new Property();
			int maxRentPropertyIndex;
			maxRentPropertyIndex = 0;
			for (int i = 0; i < getPropIndex(); i++) {
				if (maxRentProperty.getRentAmount() < properties[i].getRentAmount()) {
					maxRentPropertyIndex = i;
					maxRentProperty = properties[i];
				}
			}
			return maxRentPropertyIndex;
		}
		
		public String displayPropertyIndex(int i) {
			return properties[i].toString();
		}
		
		public String toString() {
			String str = "List of the properties for " + name + "taxID: " + taxID + "\n______________________________________________________\n";
			for (int i = 0; i < getPropIndex(); i++) {
				str += properties[i].toString() + "\n";
			}
			str += "______________________________________________________\n\n total management Fee: " + ((mgmFee/100) * totalRent());
			return str;
		}
			
			
			
			
			
			
			
			
			
			
			
			
}
