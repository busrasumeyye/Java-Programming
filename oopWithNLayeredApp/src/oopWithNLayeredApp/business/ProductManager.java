package oopWithNLayeredApp.business;

import java.util.List;
import java.util.ListIterator;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entitites.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
		
		this.productDao = productDao;
	}





	public void add(Product product) throws Exception {// response request pattern
		// iş kuralları
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}

		// JdbcProductDao productDao = new JdbcProductDao();
		 productDao.add(product);
		 for(Logger logger: loggers) { //[db,mail]
			 logger.log(product.getName());
		 }

		//ProductDao productDao = new HibernateProductDao();
		//productDao.add(product);
	}
	// bir katman başka bir katmanın classını kullanırken sadece interfaceinden erişim kurmalıdır

}
