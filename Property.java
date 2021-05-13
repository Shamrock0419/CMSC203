
public class Property {
	
	private String name;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	public Property(String name, String city, double rentAmount, String owner) {
		this.setName(name);
		this.setCity(city);
		this.setRentAmount(rentAmount);
		this.setOwner(owner);	
		plot = new Plot();
	}
	
	public Property() {
		setName("");
		setCity("");
		setRentAmount(0);
		setOwner("");
		plot = new Plot(0, 0, 1, 1);
	}
	
	public Property(Property prop) {
		setName(prop.getName());
		setCity(prop.getCity());
		setRentAmount(prop.getRentAmount());
		setOwner(prop.getOwner());
		plot = prop.plot;
	}
	
	public Property(String name, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.setName(name);
		this.setCity(city);
		this.setRentAmount(rentAmount);
		this.setOwner(owner);	
		plot = new Plot(x, y, width, depth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Plot getPlot() {
		return plot;
	}

	public Plot setPlot(int x, int y, int width, int depth) {
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		return plot;
	}
	
	public String toString() {
		return "Property Name: " + name + "\n Located in " + city + "\n Belonging to: " + owner + "\n Rent Amount: " + rentAmount;
	}
}
