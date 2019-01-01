package telran.vending.frontend.recordservice;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Table(name = "archive_maintenance_records")
@Entity
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class ArchiveMaintenanceRecordJpa {
	
	@Id
	@GeneratedValue
	public int id;
	public LocalDate date;
	public int machineId;
	public int sensorId;
	public int value;
	public int userId;
	public String comment;
	public ArchiveMaintenanceRecordJpa(LocalDate date, int machineId, int sensorId, int value, int userId, String comment) {
		super();
		this.date = date;
		this.machineId = machineId;
		this.sensorId = sensorId;
		this.value = value;
		this.userId = userId;
		this.comment = comment;
	}

}
