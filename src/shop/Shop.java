package shop;

import java.util.Vector;

public class Shop {
	private String name;
	private String address;
	private String owner;
	private Vector milkBar;

	public Shop(String name, String address, String owner, Vector milkBar) {
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkBar = milkBar;
	}

	public Shop(String name, String address, String owner) {
		this(name, address, owner, new Vector());
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getOwner() {
		return owner;
	}

	public boolean isThereMilk() {
		return milkBar.isEmpty();
	}

	public Milk buyMilk(Milk m) {
		return (Milk) milkBar.remove(milkBar.indexOf(m));
	}

	public void milkFilling(Milk m) {
		milkBar.add(m);
	}
}
