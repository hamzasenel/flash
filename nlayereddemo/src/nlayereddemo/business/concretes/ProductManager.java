package nlayereddemo.business.concretes;

import java.util.List;

import nlayereddemo.business.abstracts.ProductServices;
import nlayereddemo.dataaccess.abstracts.ProductDao;
import nlayereddemo.entities.concretes.Product;

public class ProductManager implements ProductServices{
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		productDao.add(product);
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
