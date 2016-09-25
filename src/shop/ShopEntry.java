package shop;

import food.Food;

public class ShopEntry {
	private Food food;
	private long quantity;
	private long price;

	public ShopEntry(Food food, long quantity, long price) {
		this.food = food;
		this.quantity = quantity;
		this.price = price;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void addToQuantity(long quantity) {
		this.quantity += quantity;
	}

	public void removeFromQuantity(long quantity) {
		this.quantity -= quantity;
	}
}
