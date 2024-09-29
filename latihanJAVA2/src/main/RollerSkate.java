package main;

public class RollerSkate extends Footwear {

	private int wheel;
	
	public RollerSkate(String name, int price, String type, int wheel) {
		super(name, price, type);
		this.wheel = wheel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public String toString() {
		return "Nama: " + getName() + "\n" + "Harga: " + getPrice() + "\n" + "Roda: " + getWheel(); 
	} // harus diisi biar bisa nampilin data dari child classnya
}
