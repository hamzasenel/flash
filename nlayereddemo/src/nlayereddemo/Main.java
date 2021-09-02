package nlayereddemo;

import nlayereddemo.business.abstracts.ProductServices;
import nlayereddemo.business.concretes.ProductManager;
import nlayereddemo.dataaccess.concretes.HibernateProductDao;
import nlayereddemo.entities.abstracts.Entity;
import nlayereddemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductServices productServices=new ProductManager(new HibernateProductDao());
		Entity product=new Product(1,1,"as",2,2.1);
		
		productServices.add((Product) product);

	}

}
