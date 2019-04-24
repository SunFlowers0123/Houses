package Hierarchy_of_housing;

import Enumeration.TypeOfHouse;
import Enumeration.Zone;

public class Hostel extends Home{


	public Hostel( Zone zone , int rent , int distanceToSchool , int distanceToChildrenGarten , int distanceToPlayGround ) {
		
		setZone(zone);
		setRent(rent);
		setDistanceToSchool(distanceToSchool);
		setDistanceToChildrenGarten(distanceToChildrenGarten);
		setDistanceToPlayGround(distanceToPlayGround);
		setTypeOfHouse(TypeOfHouse.HOSTEL);
	}
	
}
