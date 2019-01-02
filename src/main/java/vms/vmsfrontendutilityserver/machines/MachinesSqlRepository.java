package vms.vmsfrontendutilityserver.machines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vms.vmsfrontendutilityserver.jpa.MachineJPA;

@Repository
public interface MachinesSqlRepository extends JpaRepository<MachineJPA, Integer> {

}
