package vms.vmsfrontendutilityserver.records;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vms.vmsfrontendutilityserver.jpa.MaintenanceRecordArchiveJPA;

@Repository
public interface MaintenanceRecordArchiveRepository extends JpaRepository<MaintenanceRecordArchiveJPA, Integer> {
}
