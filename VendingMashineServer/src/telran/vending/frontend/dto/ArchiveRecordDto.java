package telran.vending.frontend.dto;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class ArchiveRecordDto {
	
	public int id;
	public LocalDate date;
	public int machineId;
	public int sensorId;
	public int value;
	public int userId;
	public String comment;
	public ArchiveRecordDto(LocalDate date, int machineId, int sensorId, int value, int userId, String comment) {
		super();
		this.date = date;
		this.machineId = machineId;
		this.sensorId = sensorId;
		this.value = value;
		this.userId = userId;
		this.comment = comment;
	}
	
	

}