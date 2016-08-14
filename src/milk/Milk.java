package milk;

import java.util.Date;

public abstract class Milk {
	private long barCode;

	public static final int LITER = 1000;
	public static final int HALFLITER = 500;
	public static final int GLASS = 200;
	public static final double GREASY = 2.8;
	public static final double HALFGREASY = 1.5;

	private int capacity;
	private String company;
	private Date warrant;
	private double dripping;

	public Milk(long barCode, int capacity, String company, Date warrant, double dripping) {
		this.barCode = barCode;
		this.capacity = capacity;
		this.company = company;
		this.warrant = warrant;
		this.dripping = dripping;
	}

	public boolean joMeg() {
		return false;
	}

	public long getBarCode() {
		return barCode;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getCompany() {
		return company;
	}

	public Date getWarrant() {
		return warrant;
	}

	public double getDripping() {
		return dripping;
	}

	public String toString() {
		return "Capacity: " + capacity + " Company: " + company + " Warrant:" + warrant + " Dripping: " + dripping;
	}

}
