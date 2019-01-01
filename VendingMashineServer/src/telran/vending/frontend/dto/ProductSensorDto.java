package telran.vending.frontend.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class ProductSensorDto {
	
	public int sensorDto;
	public int productId;
	public String productName;
	public int productPrice;
	public int sensorValue;
	
	
	public ProductSensorDto(int sensorDto, int productId, String productName, int productPrice, int sensorValue) {
		super();
		this.sensorDto = sensorDto;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.sensorValue = sensorValue;
	}
	
	

}
