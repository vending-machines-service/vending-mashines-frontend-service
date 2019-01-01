package telran.vending.frontend.productservice;

import java.util.Set;

import telran.vending.frontend.dto.OperationStatusEnum;
import telran.vending.frontend.dto.ProductDto;

public interface IProducts {
	
	public OperationStatusEnum addProduct(ProductDto product);
	public ProductDto getProduct(int productId);
	public OperationStatusEnum updateProduct(ProductDto product);
	public OperationStatusEnum flagInUse(int productId, boolean expression);
	public Set<ProductDto> getProducts();
	public OperationStatusEnum removeProduct(int produtId);
	

}
