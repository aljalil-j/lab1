
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class House {
	int     id;
    float   price;        
	String  location;    
	String  advertiser ; 
	Photo   image ;
	private Scanner in;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAdvertiser() {
		return advertiser;
	}
	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}
	public Photo getImage() {
		return image;
	}
	public void setImage(Photo image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", price=" + price + ", location=" + location + ", advertiser=" + advertiser
				+ ", image=" + image + ", getId()=" + getId() + ", getPrice()=" + getPrice() + ", getLocation()="
				+ getLocation() + ", getAdvertiser()=" + getAdvertiser() + ", getImage()=" + getImage()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public House(int id, float price, String location, String advertiser, Photo image) {
		super();
		this.id = id;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;
	}
	
	public House() {
		// TODO Auto-generated constructor stub
	}
	public void GetHouseFromUser()
	{
	try{
	in = new Scanner(System.in);
	System.out.println("Enter id number:");
	id = in.nextInt();
	System.out.println("Enter Price:");
	//price = float.next(); 
	System.out.println("Enter location:");
	location = in.next();
	}catch (InputMismatchException e){
	System.err.println("Wrong input type entered");
	}
	} 
	
	
	public void SaveStockItem() {
	try{
	//File writer will create the file if it does not exist
	//True will append data to the file
	FileWriter fileobject = new FileWriter("real estate.txt",true); 
	//Each attribute is separated by a space
	//Each Record is separated by a new line
	fileobject.write(id + " "); 
	fileobject.write(price + " ");
	fileobject.write(location + " ");
	fileobject.write(image + " ");
	fileobject.write(advertiser + " ");
	fileobject.write(image + " ");
	fileobject.write("\n");
	fileobject.close();
	//File writer might throw IOException, since it it a checked exception,
	}catch (IOException e){
	System.out.println("Could not open file");
	}
	
	}
}
