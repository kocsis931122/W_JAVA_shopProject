package bolt;

import java.util.Date;

public class Tej {
	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;

	public Tej(int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}

	public boolean joMeg() {
		return false;
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	public long getAr() {
		return ar;
	}

	public String toString() {
		return "Ûrtartalom: " + urtartalom + " Gyártó: " + gyarto + " Szavatossági idõ:" + szavatossagiIdo
				+ " Zsírtartalom: " + zsirtartalom + " Ár: " + ar;
	}

}
