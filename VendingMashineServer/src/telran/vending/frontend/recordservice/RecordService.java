package telran.vending.frontend.recordservice;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import telran.vending.frontend.dto.ArchiveRecordDto;
import telran.vending.frontend.dto.CurrentRecordDto;
import telran.vending.frontend.dto.OperationStatusEnum;

@Service
public class RecordService implements IRecords {

	@Override
	public List<CurrentRecordDto> getCurrentAllRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public telran.vending.frontend.recordservice.CurrentMTRecordMongo getCurrentMTRecord(String recordId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentRecordDto getCurrentMFRecord(String recordId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CurrentRecordDto> getCurrentMalFunctionRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<telran.vending.frontend.recordservice.CurrentMTRecordMongo> getCurrentMaintenanceRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CurrentRecordDto> getArchiveMalFunctionRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<telran.vending.frontend.recordservice.CurrentMTRecordMongo> getArchiveMaintenanceRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArchiveRecordDto getArchiveRecord(int recordId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CurrentRecordDto> getCurrentRecordsByMachine(int machineId, int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationStatusEnum completeRecord(String id, String comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArchiveRecordDto> getArchiveRecords(LocalDate since, LocalDate until) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationStatusEnum assignTechnician(int recordId, int workerId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
