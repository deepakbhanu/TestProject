package mypack;

import java.util.List;

public interface ProductDaoInterface {
	void addProduct(Product ref);
	List<Product> viewProduct(String category);
}
