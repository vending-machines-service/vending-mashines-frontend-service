package vms.vmsfrontendutilityserver.statistics;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import vms.vmsfrontendutilityserver.dto.products.ProductDTO;

public class StatisticsService implements IStatistics {
	
	@Autowired
	StatisticsRepository repo;

	@Override
	public Map<LocalDate, Integer> getIncomeByPeriod(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Integer> getPeriodAvgProfit(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMachineAvgProfit(int machineId, LocalDate from, LocalDate to) {
		return repo.selectMachineProfit(from, to);
	}

	@Override
	public Map<String, Integer> getMonthlyMachineProfitByPeriod(int machineId, LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getProductIncomeByPeriod(int productId, LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getProductSellCountPeriod(int productId, LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Integer> getListSellProductsByPeriod(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> getMostProfitableProductsByPeriod(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> getLessProfitableProductssByPeriod(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> getMostSellCountProductsByPeriod(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> getLessSellCountProductsByPeriod(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getServiceFrequency(int machineId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMachineBrokeTimeInYear(int machineId, int year) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Integer> getCurrentProductsCount() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
