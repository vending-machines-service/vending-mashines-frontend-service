package telran.vending.frontend.machineservice;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "current_state_machines")
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class MachineState {
	
	@Id
	public int macineId;
	public Map<Integer, Integer> sensorsData;
	
	
	public MachineState(int macineId, Map<Integer, Integer> sensorsData) {
		super();
		this.macineId = macineId;
		this.sensorsData = sensorsData;
	}
	
}
