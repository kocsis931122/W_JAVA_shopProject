package milk;

import java.util.Date;

import food.Food;

public abstract class Milk extends Food {
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
		super(barCode, company, warrant);
		this.capacity = capacity;
		this.dripping = dripping;
	}

	public boolean isMilkFine() {
		return new Date().before(warrant);
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
		return super.toString() + "Dripping: " + dripping;
	}

}
