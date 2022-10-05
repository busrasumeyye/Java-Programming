package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entitites.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone Xr",10000);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
	}

}
//iş geliştirme:kişiye özel datanın gelmesi
//1-data acces,2-business-3-UI,yardımcı katman API
