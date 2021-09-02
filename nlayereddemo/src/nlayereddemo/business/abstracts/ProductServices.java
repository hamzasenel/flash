package nlayereddemo.business.abstracts;

import java.util.List;

import nlayereddemo.entities.concretes.Product;

public interface ProductServices {

	void add(Product product);
	List<Product> getAll();
}
