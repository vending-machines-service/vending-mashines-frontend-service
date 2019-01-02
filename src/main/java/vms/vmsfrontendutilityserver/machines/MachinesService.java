package vms.vmsfrontendutilityserver.machines;

import org.springframework.stereotype.Service;

import vms.vmsfrontendutilityserver.dto.OperationStatusEnum;
import vms.vmsfrontendutilityserver.dto.machines.MachineDTO;
import vms.vmsfrontendutilityserver.dto.machines.MachineStateDTO;

@Service
public class MachinesService implements IMachines {

  @Override
  public OperationStatusEnum addMachine(MachineDTO machine) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OperationStatusEnum updateMachine(MachineDTO machine) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public MachineDTO getMachine(int machineId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OperationStatusEnum removeMachine(int machineId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public MachineStateDTO getMachineState(int machineId) {
    // TODO Auto-generated method stub
    return null;
  }
}
