package telran.vending.frontend.machineservice;

import telran.vending.frontend.dto.MachineDto;
import telran.vending.frontend.dto.MachineStateDto;
import telran.vending.frontend.dto.OperationStatusEnum;

public interface IMachine {
	
	public OperationStatusEnum addMachine(MachineDto machine); 
	public OperationStatusEnum updateMachine(MachineDto machine);
	public MachineDto getMachine(int machineId);
	public OperationStatusEnum removeMachine(int machineId);
	public MachineStateDto getMachineState(int machineId);

}
