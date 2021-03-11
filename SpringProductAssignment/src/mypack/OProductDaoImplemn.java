package mypack;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class OProductDaoImplemn implements ProductDaoInterface {


	
	@Override
	public void addProduct(Product ref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> viewProduct(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
