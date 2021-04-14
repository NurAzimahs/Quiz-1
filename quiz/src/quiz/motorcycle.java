package quiz;
import java.util.Scanner;
public class motorcycle {
	Scanner s = new Scanner(System.in);
	
	String brand;
	String model;
	String color;
	double weight,price;
	
	 // Create Setter Method
	  public void setBrand() {
		  System.out.print("Enter Brand : ");
		  this.brand = s.nextLine();
	  }
	  
	  public void setModel() {
		  System.out.print("Enter Model : ");
		  this.model = s.nextLine();
	  }
	  
	  public void setColor() {
		  System.out.print("Enter Colour : ");
		  this.color = s.nextLine();
	  }
	  
	  public void setWeight() {
		  System.out.print("Enter Weight : ");
		  this.weight = s.nextDouble();
	  }

	  public void setPrice() {
		  System.out.print("Enter Price : ");
		  this.price = s.nextDouble();
	  }

	  // Create Getter Method
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getModel() {
		  return this.model;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }

	  public double getWeight() {
		  return this.weight;
	  }

	  public double getPrice() {
		  return this.price;
	  }
	  
	  public void Promotion() {
		System.out.println("You will offered free service for 5 months !!");
	}
}
