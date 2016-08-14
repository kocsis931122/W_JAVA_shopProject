package shop;

import java.util.Hashtable;

import milk.Milk;

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
		ShopEntry entry = (ShopEntry) milkBar.get(barCode);
		if (entry != null) {
			entry.removeFromQuantity(1);
			return entry.getMilk();
		}
		return null;
	}

	public void milkFilling(Milk m) {
		ShopEntry entry = (ShopEntry) milkBar.get(m.getBarCode());
		if (entry == null) {
			entry = new ShopEntry(m, 1, 100);
			milkBar.put(m.getBarCode(), entry);
		} else
			entry.addToQuantity(1);
	}
}
