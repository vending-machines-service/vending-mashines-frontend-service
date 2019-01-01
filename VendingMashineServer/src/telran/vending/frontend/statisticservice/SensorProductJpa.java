package telran.vending.frontend.statisticservice;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import telran.vending.frontend.dto.OperationStatusEnum;



@Table(name ="selling")
@Entity
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class SensorProductJpa {
	@Id
	@GeneratedValue
	int id;
	@Column(name = "date")
	public LocalDate date;
	@Column(name = "machine_id")
	public int machineId;
	@Column(name = "product_id")
	public int sensorId;
	public int quantity;
	public OperationStatusEnum status;
	
	
	public SensorProductJpa(LocalDate date, int machineId, int sensorId, int quantity, OperationStatusEnum status) {
		super();
		this.date = date;
		this.machineId = machineId;
		this.sensorId = sensorId;
		this.quantity = quantity;
		this.status = status;
	}



}
