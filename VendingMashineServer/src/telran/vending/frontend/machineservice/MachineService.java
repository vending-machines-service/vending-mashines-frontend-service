package telran.vending.frontend.machineservice;

import org.springframework.stereotype.Service;

import telran.vending.frontend.dto.MachineDto;
import telran.vending.frontend.dto.MachineStateDto;
import telran.vending.frontend.dto.OperationStatusEnum;

@Service
public class MachineService implements IMachine {

	@Override
	public OperationStatusEnum addMachine(MachineDto machine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationStatusEnum updateMachine(MachineDto machine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MachineDto getMachine(int machineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationStatusEnum removeMachine(int machineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MachineStateDto getMachineState(int machineId) {
		// TODO Auto-generated method stub
		return null;
	}

}
