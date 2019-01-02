package vms.vmsfrontendutilityserver.dto.machines;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class MachineStateDTO {

  public int machineId;
  public Map<String, Integer> productsBoxes;// percentages
  public int moneyBoxesRest; // percentages
  public int moneyIncomeBoxes;// percentages
  public MachineStateEnum state;

  public MachineStateDTO(int machineId, Map<String, Integer> productsBoxes, int moneyBoxesRest, int moneyIncomeBoxes,
      MachineStateEnum state) {
    super();
    this.machineId = machineId;
    this.productsBoxes = productsBoxes;
    this.moneyBoxesRest = moneyBoxesRest;
    this.moneyIncomeBoxes = moneyIncomeBoxes;
    this.state = state;
  }

}
