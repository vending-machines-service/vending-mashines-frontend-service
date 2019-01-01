package telran.vending.frontend.recordservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchiveMalfunctionRecordRepository extends 
	JpaRepository<ArchiveMalFunctionRecordJpa, Integer>{

}
