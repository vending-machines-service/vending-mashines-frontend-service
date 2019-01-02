package vms.vmsfrontendutilityserver.records;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import vms.vmsfrontendutilityserver.dto.records.MTRecordCurrentDTO;


@Repository
public interface MaintenanceCurrentRepository extends MongoRepository<MTRecordCurrentDTO, String>{
}
