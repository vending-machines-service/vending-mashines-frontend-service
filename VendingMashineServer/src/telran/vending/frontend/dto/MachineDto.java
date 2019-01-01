package telran.vending.frontend.dto;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class MachineDto {
	
	public int machineId;
	public String firmaName;
	public String location;
	public Map<Integer, Integer> productSensor;
	
	
	public MachineDto(int machineId, String firmaName, String location, Map<Integer, Integer> productSensor) {
		super();
		this.machineId = machineId;
		this.firmaName = firmaName;
		this.location = location;
		this.productSensor = productSensor;
	}
	
	

}
