package vms.vmsfrontendutilityserver.statistics;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import vms.vmsfrontendutilityserver.jpa.SensorProductJPA;

public interface StatisticsRepository extends JpaRepository<SensorProductJPA, Integer> {
	
	@Query(value = "SELECT")
	int selectMachineProfit(LocalDate from, LocalDate to);
}
