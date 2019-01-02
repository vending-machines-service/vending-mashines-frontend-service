package vms.vmsfrontendutilityserver.dto.records;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import vms.vmsfrontendutilityserver.dto.PersistanceConstants;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = PersistanceConstants.CURRENT_MALFUNCTION_RECORDS_TABLE)
public class MFRecordCurrentDTO {

  @Id
  public String id;
  public LocalDate date;
  public int machineId;
  public int sensorId;
  public int value;
  public int userId;

  public MFRecordCurrentDTO(LocalDate date, int machineId, int sensorId, int value, int userId) {
    super();
    this.id = String.format("%d-%d", machineId, sensorId);
    this.date = date;
    this.machineId = machineId;
    this.sensorId = sensorId;
    this.value = value;
    this.userId = userId;
  }
}
