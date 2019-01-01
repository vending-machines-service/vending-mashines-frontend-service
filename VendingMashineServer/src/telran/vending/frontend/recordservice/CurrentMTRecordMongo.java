package telran.vending.frontend.recordservice;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
@Document(collection = "current_MT_records")
public class CurrentMTRecordMongo {
	
	@Id
	public String id;
	public LocalDate date;
	public int machineId;
	public int sensorId;
	public int value;
	public int userId;
	
	public CurrentMTRecordMongo(LocalDate date, int machineId, int sensorId, int value, int userId) {
		super();
		this.id = String.format("%d-%d", machineId, sensorId);
		this.date = date;
		this.machineId = machineId;
		this.sensorId = sensorId;
		this.value = value;
		this.userId = userId;
	}
	
	
}
