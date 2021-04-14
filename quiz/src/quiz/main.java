package quiz;

public class main {

	public static void main(String[] args) {
		motorcycle y = new motorcycle();
		y.setBrand();
		y.setModel();
		y.setColor();
		y.setPrice();
		y.setWeight();
		
		System.out.println();
		System.out.println("Brand: " + y.getBrand());
		System.out.println("Model: " + y.getModel());
		System.out.println("Color: " + y.getColor());
		System.out.println("Prize: RM " + y.getPrice());
		System.out.println("Weight: " + y.getWeight() + "Kg");
		y.Promotion();
		System.out.println();
		
		motorcycle k = new motorcycle();
		k.setBrand();
		k.setModel();
		k.setColor();
		k.setPrice();
		k.setWeight();
		System.out.println();
		
		System.out.println("Brand: " + k.getBrand());
		System.out.println("Model: " + k.getModel());
		System.out.println("Color: " + k.getColor());
		System.out.println("Prize: RM " + k.getPrice());
		System.out.println("Weight: " + k.getWeight() + "Kg");
		k.Promotion();
		System.out.println();

	}

}
