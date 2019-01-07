package vms.vmsfrontendutilityserver.statistics;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import vms.vmsfrontendutilityserver.dto.products.ProductDTO;

public interface IStatistics {
	
	public Map<LocalDate, Integer> getIncomeByPeriod(LocalDate from, LocalDate to);
	public Map<Integer, Integer> getPeriodAvgProfit(LocalDate from, LocalDate to);
	public int getMachineAvgProfit(int machineId, LocalDate from, LocalDate to);
	public Map<String, Integer>  getMonthlyMachineProfitByPeriod(int machineId, LocalDate from, LocalDate to);
	public int getProductIncomeByPeriod(int productId, LocalDate from, LocalDate to);
	public int getProductSellCountPeriod(int productId, LocalDate from, LocalDate to);
	public Map<String, Integer> getListSellProductsByPeriod(LocalDate from, LocalDate to);
	public List<ProductDTO> getMostProfitableProductsByPeriod(LocalDate from, LocalDate to);
	public List<ProductDTO> getLessProfitableProductssByPeriod(LocalDate from, LocalDate to);
	public List<ProductDTO> getMostSellCountProductsByPeriod(LocalDate from, LocalDate to);
	public List<ProductDTO> getLessSellCountProductsByPeriod(LocalDate from, LocalDate to);
	public int getServiceFrequency(int machineId);
	public int getMachineBrokeTimeInYear(int machineId, int year);
	public Map<String, Integer >getCurrentProductsCount();
}
