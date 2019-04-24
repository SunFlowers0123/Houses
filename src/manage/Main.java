package manage;
import java.util.Scanner;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SalesManager manager = new SalesManager(); // create objec manager
		int distanceToSchool;int distanceToChildrenGarden; 
		int chooseLocation;int price;
		// offer 
		System.out.println("You want to buy apartments in Lviv");
		System.out.println("You turn to sales manager");
		System.out.println("The manager show you list of appartments : ");
		manager.printAvailableAppartaments();
		System.out.println("\n");
		System.out.println("You can find the apartments which you are loocking : ");
		System.out.println("Chooce location : ");
		System.out.println("1 - Shevchenko");
		System.out.println("2 - Lychakiv");
		System.out.println("3 - Sykhiv");
		System.out.println("4 - Frankivsk");
		System.out.println("5 - Railway ");
		System.out.println("6 - Galitsky");
		
		System.out.print("Print :");chooseLocation=scan.nextInt();
		System.out.print("Print distance to children garden : "); distanceToChildrenGarden=scan.nextInt();
		System.out.print("Print distance to School : " );distanceToSchool=scan.nextInt();
		
		manager.searchApartamentsByLocationAndDistance(chooseLocation,distanceToChildrenGarden ,distanceToSchool); 
		System.out.println();
		System.out.print("What amount of money you expect : ");price=scan.nextInt();
		System.out.println("Sort by price : ");
		
		manager.sortByPrice(price, chooseLocation,distanceToChildrenGarden ,distanceToSchool);
		
		
		
	}

}
