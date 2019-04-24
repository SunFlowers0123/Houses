package Hierarchy_of_housing;

import Enumeration.TypeOfHouse;
import Enumeration.Zone;

public class Penthouse extends Home{
	
	public Penthouse( Zone zone , int rent , int price , int distanceToSchool , int distanceToChildrenGarten , int distanceToPlayGround ) {
		
		setZone(zone);
		setRent(rent);
		setPrice(price);
		setDistanceToSchool(distanceToSchool);
		setDistanceToChildrenGarten(distanceToChildrenGarten);
		setDistanceToPlayGround(distanceToPlayGround);
		setTypeOfHouse(TypeOfHouse.PENTHOUSE);
	}
	
}
