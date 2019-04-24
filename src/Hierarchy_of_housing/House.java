package Hierarchy_of_housing;

import Enumeration.TypeOfHouse;
import Enumeration.Zone;

public class House	extends Home {
	
	
public House( Zone zone , int rent , int price , int distanceToSchool , int distanceToChildrenGarten , int distanceToPlayGround ) {
		setZone(zone);
		setRent(rent);
		setPrice(price);
		setDistanceToSchool(distanceToSchool);
		setDistanceToChildrenGarten(distanceToChildrenGarten);
		setDistanceToPlayGround(distanceToPlayGround);
		setTypeOfHouse(TypeOfHouse.HOUSE);
	}


	
	
}
