package oopWithNLayeredApp.business;

import oopWithNLayeredApp.entitites.Product;

public class ProductManager {
	public void add(Product product) throws Exception {//response request pattern
		//iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}
	}
	

}
