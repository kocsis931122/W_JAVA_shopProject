package shop;

public class Shop {
	private String name;
	private String address;
	private String owner;
	private Milk[] milkBar;
	private int flag;

	public Shop(String name, String address, String owner, Milk[] milkBar, int flag) {
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkBar = milkBar;
		flag = milkBar.length - 1;
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
		return flag >= 0;
	}

	public Milk buyMilk(Milk m) {
		return milkBar[flag--];
	}

	public void milkFilling(Milk m) {
		milkBar[++flag] = m;
	}
}
