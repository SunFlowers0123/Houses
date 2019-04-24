package manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.LocalAttribute;

import Enumeration.TypeOfHouse;
import Enumeration.Zone;
import Hierarchy_of_housing.Flat;
import Hierarchy_of_housing.Home;
import Hierarchy_of_housing.Hostel;
import Hierarchy_of_housing.House;
import Hierarchy_of_housing.Penthouse;

public class SalesManager {
	private Random rand = new Random();
	private List<Home>listOfSales = new ArrayList<>();
	private List<Home>listOfApartments = new ArrayList<>();
	private void availableHousing() {
		int numbersOfHouses = (rand.nextInt(700)+1)/6;
		int priceRent;int priceBuy;int distanceToSchool;
		int distanceToChildrenGarden;int distanceToPlayground;
		int randomValue=rand.nextInt(5)+1;
		
		for(int i=0;i<numbersOfHouses;i++) {
			listOfSales.add(new Flat(Zone.values()[randomValue],priceRent=rand.nextInt(1000)+400,
					 priceBuy=rand.nextInt(75_000)+35_000, distanceToSchool=rand.nextInt(5)+1 ,
					 distanceToChildrenGarden=rand.nextInt(5)+1,distanceToPlayground=rand.nextInt(5)+1));
		
			listOfSales.add(new House(Zone.values()[randomValue],priceRent=rand.nextInt(3000)+900,
					 priceBuy=rand.nextInt(400_000)+135_000, distanceToSchool=rand.nextInt(5)+1 ,
					 distanceToChildrenGarden=rand.nextInt(5)+1,distanceToPlayground=rand.nextInt(5)+1));

			listOfSales.add(new Penthouse(Zone.values()[randomValue],priceRent=rand.nextInt(30_000)+10_000,
					 priceBuy=rand.nextInt(300_000)+100_000, distanceToSchool=rand.nextInt(5)+1 ,
					 distanceToChildrenGarden=rand.nextInt(5)+1,distanceToPlayground=rand.nextInt(5)+1));

			listOfSales.add(new Hostel(Zone.values()[randomValue],
					 priceRent=rand.nextInt(1000)+100, distanceToSchool=rand.nextInt(5)+1 ,
					 distanceToChildrenGarden=rand.nextInt(5)+1,distanceToPlayground=rand.nextInt(5)+1));	
			
		}
	}
	
	public void printAvailableAppartaments(){
		availableHousing();
		for(int i=0;i<listOfSales.size();i++) {
			System.out.println( i + ") " + listOfSales.get(i).getTypeOfHouse() + "     price: " +  listOfSales.get(i).getPrice()+"$"
			+ " rent : " + listOfSales.get(i).getRent() + "$");
		}
	}
	
	public void searchApartamentsByLocationAndDistance( int location , int distanceToChildrenGarden , int distanceToSchool ) {
		
		int k=1;
		for(int i=0;i<listOfSales.size();i++) {
				if((listOfSales.get(i).getDistanceToChildrenGarten()<=distanceToChildrenGarden)&&(listOfSales.get(i).getDistanceToSchool()<=distanceToSchool)) {
					System.out.println(k+" ) " + listOfSales.get(i).getZone().values()[location-1] + "  " + listOfSales.get(i).getTypeOfHouse());
					k++;
				}
		}
	}
	
	public void sortByPrice(int price, int location , int distanceToChildrenGarden , int distanceToSchool ) {
		sortApartmentsByPrice(listOfSales);
		int k=1;
		for(int i=0;i<listOfSales.size();i++) {
				if((listOfSales.get(i).getDistanceToChildrenGarten()<=distanceToChildrenGarden)&&(listOfSales.get(i).getDistanceToSchool()<=distanceToSchool)&&(
						listOfSales.get(i).getPrice()<=price)) {
					System.out.println(k+" ) " + listOfSales.get(i).getZone().values()[location-1] + "  " + listOfSales.get(i).getTypeOfHouse()
							+ "  " + listOfSales.get(i).getPrice() + " rent : " + listOfSales.get(i).getRent());
					k++;
				}
		}
	}
	
	private void sortApartmentsByPrice(List<Home> list){
        Collections.sort(list, new Comparator<Home>() {
            @Override
        	public int compare(Home o1, Home o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
	}
	
}
	
	
