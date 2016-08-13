package shop;

import java.util.Hashtable;

public class Shop {
	private String name;
	private String address;
	private String owner;
	private Hashtable milkBar;

	public Shop(String name, String address, String owner, Hashtable milkBar) {
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkBar = milkBar;
	}

	public Shop(String name, String address, String owner) {
		this(name, address, owner, new Hashtable());
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

	public Milk buyMilk(long barCode) {
		return (Milk) milkBar.remove(milkBar.get(new Long(barCode)));
	}

	public void milkFilling(Milk m) {
		milkBar.put(new Long(m.getBarCode()), m);
	}
}
