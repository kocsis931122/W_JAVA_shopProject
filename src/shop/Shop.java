package shop;

import java.util.Enumeration;
import java.util.Hashtable;

import exception.NonExistentProductException;
import exception.TooManyDeductionsException;
import food.Food;
import milk.Milk;

public class Shop {
	private String name;
	private String address;
	private String owner;
	private Hashtable foodBar;

	public Shop(String name, String address, String owner, Hashtable foodBar) {
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.foodBar = foodBar;
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

	public boolean thereAreMilk() {
		return isThereProduct(Milk.class);
	}

	public boolean isThereProduct(Class c) {
		for (Enumeration e = foodBar.elements(); e.hasMoreElements();) {
			ShopEntry s = (ShopEntry) e.nextElement();
			if (c.isInstance(s.getFood()) && s.getQuantity() > 0)
				return true;
		}
		return false;
	}

	public void buyFood(long barCode, long quantity) throws NonExistentProductException, TooManyDeductionsException {
		ShopEntry shopEntry = (ShopEntry) foodBar.get(barCode);
		if (shopEntry == null)
			throw new NonExistentProductException("Ilyen aru nincsen:" + barCode);
		if (shopEntry != null) {
			if (shopEntry.getQuantity() < quantity)
				throw new TooManyDeductionsException("Nincs elegendo mennyiseg:" + barCode);
			{
				shopEntry.removeFromQuantity(quantity);
			}
		}

	}

	public void fillingFood(long barCode, long quantity) throws ShopException {
		ShopEntry shopEntry = (ShopEntry) foodBar.get(barCode);
		if (shopEntry == null)
			throw new NonExistentProductException("Ilyen aru nincsen:" + barCode);
		{
			shopEntry.addToQuantity(quantity);
		}
	}

	public void fillingWithNewFood(Food food, long quantity, long price) {
		ShopEntry shopEntry = new ShopEntry(food, quantity, price);
		shopEntry.addToQuantity(quantity);
	}

	public void deleteFood(long barCode) throws NonExistentProductException {
		if (foodBar.remove(barCode) == null)
			throw new NonExistentProductException("Ilyen aru nincsen:" + barCode);
	}

}
