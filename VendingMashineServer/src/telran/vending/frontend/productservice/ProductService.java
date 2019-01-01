package telran.vending.frontend.productservice;

import java.util.Set;

import org.springframework.stereotype.Service;

import telran.vending.frontend.dto.OperationStatusEnum;
import telran.vending.frontend.dto.ProductDto;

@Service
public class ProductService implements IProducts {

	@Override
	public OperationStatusEnum addProduct(ProductDto product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDto getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationStatusEnum updateProduct(ProductDto product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationStatusEnum flagInUse(int productId, boolean expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<ProductDto> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationStatusEnum removeProduct(int produtId) {
		// TODO Auto-generated method stub
		return null;
	}

}
