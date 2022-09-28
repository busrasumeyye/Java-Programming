package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		// product1.name = "laptop";
		// product1.id = 1;
		// product1.description = "Asus Laptop";
		// product1.price = 5000;
		// product1.stockAmount = 3;
		// product1.renk="";

		product1.setName("Laptop");
		product1.setId(1);
		product1.setDescription("Asus Laptop");
		product1.setPrice(5000);
		product1.setStockAmount(3);
		product1.setRenk("mor");

		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		System.out.println(product1.getKod());
		// productManager.Add2(1, null, null, 0, 200);

		// System.out.println(product1.name);

	}

}
