package telran.vending.frontend.machineservice;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "machines")
@Entity
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class MachineJpa {
	@Id
	@Column(name = "machine_id")
	public int machineId;
	@Column(name = "firma_name")
	public String firmaName;
	public String location;
	public Map<Integer, Integer> productSensor;
	
	
	
	public MachineJpa(int machineId, String firmaName, String location, Map<Integer, Integer> productSensor) {
		super();
		this.machineId = machineId;
		this.firmaName = firmaName;
		this.location = location;
		this.productSensor = productSensor;
	}
	

}
