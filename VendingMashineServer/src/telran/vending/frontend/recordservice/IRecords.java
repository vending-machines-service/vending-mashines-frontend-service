package telran.vending.frontend.recordservice;

import java.time.LocalDate;
import java.util.List;

import telran.vending.frontend.dto.ArchiveRecordDto;
import telran.vending.frontend.dto.CurrentRecordDto;
import telran.vending.frontend.dto.OperationStatusEnum;

public interface IRecords {
	
	public List<CurrentRecordDto> getCurrentAllRecord();
	public CurrentMTRecordMongo getCurrentMTRecord(String recordId);
	public CurrentRecordDto getCurrentMFRecord(String recordId);
	public List<CurrentRecordDto> getCurrentMalFunctionRecord();
	public List<CurrentMTRecordMongo> getCurrentMaintenanceRecord();
	public List<CurrentRecordDto> getArchiveMalFunctionRecord();
	public List<CurrentMTRecordMongo> getArchiveMaintenanceRecord();
	public ArchiveRecordDto getArchiveRecord(int recordId);
	public List<CurrentRecordDto> getCurrentRecordsByMachine(int machineId,int from, int to);
	public OperationStatusEnum completeRecord(String id, String comment);
	public List<ArchiveRecordDto>  getArchiveRecords(LocalDate since, LocalDate until);
	public OperationStatusEnum assignTechnician(int recordId, int workerId);
	

}
