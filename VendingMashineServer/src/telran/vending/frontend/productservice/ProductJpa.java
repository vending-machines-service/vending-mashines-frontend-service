package telran.vending.frontend.productservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "products")
@Entity
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class ProductJpa {
	
	@Id
	public int productId;
	public String name;
	public int price;
	public boolean isAvailable;
	
	
	public ProductJpa(int productId, String name, boolean isAvailable) {
		super();
		this.productId = productId;
		this.name = name;
		this.isAvailable = isAvailable;
	}
	
	

}
