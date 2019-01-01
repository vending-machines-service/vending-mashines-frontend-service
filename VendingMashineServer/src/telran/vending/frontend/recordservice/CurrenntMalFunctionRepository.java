package telran.vending.frontend.recordservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CurrenntMalFunctionRepository extends MongoRepository<CurrentMFRecordMongo, String> {

}
