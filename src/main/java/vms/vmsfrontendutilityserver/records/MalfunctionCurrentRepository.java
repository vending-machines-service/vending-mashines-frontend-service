package vms.vmsfrontendutilityserver.records;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import vms.vmsfrontendutilityserver.dto.records.MFRecordCurrentDTO;



@Repository
public interface MalfunctionCurrentRepository extends MongoRepository<MFRecordCurrentDTO, String> {
}
