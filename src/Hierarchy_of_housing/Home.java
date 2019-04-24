package Hierarchy_of_housing;


import Enumeration.TypeOfHouse;
import Enumeration.Zone;

public abstract class Home {
	
	private Zone zone;
	private int price;
	private int rent;
	private int distanceToSchool;
	private int distanceToChildrenGarten;
	private int distanceToPlayGround;
	private TypeOfHouse typeOfHouse;
	
	
	
	protected void setTypeOfHouse(TypeOfHouse typeOfHouse) {
		this.typeOfHouse= typeOfHouse;
	}
	
	public TypeOfHouse getTypeOfHouse() {
		return typeOfHouse;
	}
	
	
	
	public Zone getZone() {
		return zone;
	}
	protected void setZone(Zone zone) {
		this.zone = zone;
	}
	public int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	public int getRent() {
		return rent;
	}
	protected void setRent(int rent) {
		this.rent = rent;
	}
	public int getDistanceToSchool() {
		return distanceToSchool;
	}
	protected void setDistanceToSchool(int distanceToSchool) {
		this.distanceToSchool = distanceToSchool;
	}
	public int getDistanceToChildrenGarten() {
		return distanceToChildrenGarten;
	}
	protected void setDistanceToChildrenGarten(int distanceToChildrenGarten) {
		this.distanceToChildrenGarten = distanceToChildrenGarten;
	}
	public int getDistanceToPlayGround() {
		return distanceToPlayGround;
	}
	protected void setDistanceToPlayGround(int distanceToPlayGround) {
		this.distanceToPlayGround = distanceToPlayGround;
	}
	
}
