package telran.vending.frontend.recordservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentMaintenanceRepository extends MongoRepository<CurrentMTRecordMongo, String>{

}
