package shop;

import java.util.Date;

public class Milk {
	public static final int LITER = 1000;
	public static final int HALFLITER = 500;
	public static final int GLASS = 200;
	public static final double GREASY = 2.8;
	public static final double HALFGREASY = 1.5;

	private int capacity;
	private String company;
	private Date warrant;
	private double dripping;
	private long price;

	public Milk(int capacity, String company, Date warrant, double dripping, long price) {
		this.capacity = capacity;
		this.company = company;
		this.warrant = warrant;
		this.dripping = dripping;
		this.price = price;
	}

	public boolean joMeg() {
		return false;
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

	public long getPrice() {
		return price;
	}

	public String toString() {
		return "Capacity: " + capacity + " Company: " + company + " Warrant:" + warrant + " Dripping: " + dripping
				+ " Price: " + price;
	}

}
