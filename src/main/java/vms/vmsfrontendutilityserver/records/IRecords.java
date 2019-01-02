package vms.vmsfrontendutilityserver.records;

import java.time.LocalDate;
import java.util.List;

import vms.vmsfrontendutilityserver.dto.OperationStatusEnum;
import vms.vmsfrontendutilityserver.dto.records.MTRecordCurrentDTO;
import vms.vmsfrontendutilityserver.dto.records.RecordArchiveDTO;
import vms.vmsfrontendutilityserver.dto.records.RecordCurrentDTO;


public interface IRecords {

  public List<RecordCurrentDTO> getCurrentAllRecord();

  public MTRecordCurrentDTO getCurrentMTRecord(String recordId);

  public RecordCurrentDTO getCurrentMFRecord(String recordId);

  public List<RecordCurrentDTO> getCurrentMalFunctionRecord();

  public List<MTRecordCurrentDTO> getCurrentMaintenanceRecord();

  public List<RecordCurrentDTO> getArchiveMalFunctionRecord();

  public List<MTRecordCurrentDTO> getArchiveMaintenanceRecord();

  public RecordArchiveDTO getArchiveRecord(int recordId);

  public List<RecordCurrentDTO> getCurrentRecordsByMachine(int machineId, int from, int to);

  public OperationStatusEnum completeRecord(String id, String comment);

  public List<RecordArchiveDTO> getArchiveRecords(LocalDate since, LocalDate until);

  public OperationStatusEnum assignTechnician(int recordId, int workerId);

}
