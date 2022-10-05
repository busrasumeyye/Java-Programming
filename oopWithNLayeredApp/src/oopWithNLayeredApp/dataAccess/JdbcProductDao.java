package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entitites.Product;

public class JdbcProductDao {
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır SQL
		System.out.println("JDBC ile veritabanına eklendi");
		
	}
	
//aynı üründe isim ekleyememek business domain
}
