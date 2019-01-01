package telran.vending.frontend.userservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import telran.vending.frontend.dto.UserDto;

@Repository
public interface UsersDataRepository extends MongoRepository<UserDto, Integer> {

}
