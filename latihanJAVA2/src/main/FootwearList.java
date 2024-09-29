package main;

import java.util.ArrayList;

public class FootwearList {
	
	private ArrayList<Footwear> footList;

	public FootwearList() {
		footList = new ArrayList<>();
	}
	
	public void addFootwearList(Footwear footwear) {
		footList.add(footwear);
	}
		
	public void displayFootwearList() {
		for (int i = 0; i < footList.size(); i++) {
			System.out.println(footList.get(i));
		}
	}
	
	public int footwearListSize() {
		return footList.size();
	}
	
	public void updateFootwearList(int index, Footwear footwear) {
		for (index = 0; index < footList.size(); index++) {
			footList.set(index, footwear);
		}
	}
	
	public boolean heelsFootwearList() {
		for (int index = 0; index < footList.size(); index++) {
			if (footList.get(index).getType().equals("Heels")) {
				return true;
			}
		}
		return false;
	}
	
	public boolean rollerSkateFootwearList() {
		for (int index = 0; index < footList.size(); index++) {
			if (footList.get(index).getType().equals("RollerSkate")) {
				return true;
			}
		}
		return false;
	}
	
	public void deleteFootwearList(int x) {
		for (x = 0; x < footList.size(); x++) {
			footList.remove(x);
		}
	}
}
