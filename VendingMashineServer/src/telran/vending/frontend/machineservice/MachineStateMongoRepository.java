package telran.vending.frontend.machineservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineStateMongoRepository extends MongoRepository<MachineState, Integer>{

}
