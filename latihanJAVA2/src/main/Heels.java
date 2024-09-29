package main;

public class Heels extends Footwear{

	private double height;
	
	public Heels(String name, int price, String type, double height) {
		super(name, price, type);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String toString() {
		return "Nama: " + getName() + "\n" + "Harga: " + getPrice() + "\n" + "Tinggi: " + getHeight() + "\n\n";
	} // harus diisi biar bisa nampilin data dari child classnya
}
