
public class Driver {

	public static void main(String[] args) {
		House[] houses  =new  House[3];
 houses [0] = new House();
 houses[0].GetHouseFromUser();
 houses[0].SaveStockItem();
		System.out.println("enter id"+houses[0]);
		System.out.println("enter price"+houses[0].getPrice());
		System.out.println("enter advertiser"+houses[0]);
		System.out.println("enter location"+houses[0]);
		System.out.println("enter image"+houses[0]);

	}

}
