
public class Plot {

	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot(int x, int y, int width, int depth) {
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setDepth(depth);
	}
	
	public Plot() {
		this.setX(0);
		this.setY(0);
		this.setWidth(10);
		this.setDepth(10);
	}
	
	public Plot(Plot plot) {
		this.setX(plot.getX());
		this.setY(plot.getY());
		this.setWidth(plot.getWidth());
		this.setDepth(plot.getDepth());
	}
	
	public boolean overlaps(Plot plot) {
		if ((plot.getX() >= (this.getX() + this.getWidth())) || ((plot.getX() + plot.getWidth()) <= this.getX())) {
			return false;
		}
		if ((plot.getY() >= (this.getY() + this.getDepth())) || ((plot.getY() + plot.getDepth()) <= this.getY())) {
			return false;
		}
		return true;
	}
	
	public boolean encompasses(Plot plot) {
		if ((plot.getX() >= this.getX()) && (plot.getX() <= (this.getX() + this.getWidth()))) {
			if (((plot.getX() + plot.getWidth()) >= this.getX()) && ((plot.getX() + plot.getWidth()) <= (this.getX() + this.getWidth()))) {
				if ((plot.getY() >= this.getY()) && (plot.getY() <= (this.getY() + this.getDepth()))) {
					if (((plot.getY() + plot.getDepth()) >= this.getY()) && ((plot.getY() + plot.getDepth()) <= (this.getY() + this.getDepth()))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String toString() {
		String str = "Upper left: (" + x + "," + y + "); Width: " + this.width + " Depth: " + this.depth;
		return str;
	}
	
	
}
