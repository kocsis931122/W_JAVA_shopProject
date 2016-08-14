package food;

import java.util.Date;

public class Food {
	protected long barCode;
	protected String company;
	protected Date warrant;

	public Food(long barCode, String company, Date warrant) {
		this.barCode = barCode;
		this.company = company;
		this.warrant = warrant;
	}

	public long getBarCode() {
		return barCode;
	}

	public String getCompany() {
		return company;
	}

	public Date getWarrant() {
		return warrant;
	}

	public boolean isMilkFine() {
		return new Date().before(warrant);
	}

	@Override
	public String toString() {
		return "Barcode: " + barCode + " Company: " + company + " Warrant: " + warrant;
	}

}
