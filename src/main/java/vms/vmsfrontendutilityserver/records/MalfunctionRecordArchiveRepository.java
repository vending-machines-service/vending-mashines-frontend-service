package vms.vmsfrontendutilityserver.records;

import org.springframework.data.jpa.repository.JpaRepository;

import vms.vmsfrontendutilityserver.jpa.MalfunctionRecordArchiveJPA;

public interface MalfunctionRecordArchiveRepository extends 
	JpaRepository<MalfunctionRecordArchiveJPA, Integer>{
}
