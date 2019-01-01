package telran.vending.frontend.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class SpecificationDto {
	
	public int sensorId;
	public SensorType type;
	public int sensorValue;
	public String discription;
	
	
	public SpecificationDto(int sensorId, SensorType type, int sensorValue, String discription) {
		super();
		this.sensorId = sensorId;
		this.type = type;
		this.sensorValue = sensorValue;
		this.discription = discription;
	}
	
	

}
