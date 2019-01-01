package telran.vending.frontend.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class ProductDto {
	
	public int productId;
	public String name;
	public int price;
	public boolean isAvailable;
	
	
	public ProductDto(int productId, String name, int price, boolean isAvailable) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	

}
