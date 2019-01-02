package vms.vmsfrontendutilityserver.statistics;

import org.springframework.data.jpa.repository.JpaRepository;

import vms.vmsfrontendutilityserver.jpa.SensorProductJPA;

public interface StatisticsRepository extends JpaRepository<SensorProductJPA, Integer> {
}
