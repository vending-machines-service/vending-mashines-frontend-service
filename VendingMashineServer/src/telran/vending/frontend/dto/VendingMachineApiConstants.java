package telran.vending.frontend.dto;

public interface VendingMachineApiConstants {
	
	String ADD_USER = "/user"; //POST
	String GET_USER = "/user"; //GET
	String UPDATE_USER = "/user/update"; //POST  maybe without "/{machine_id:int}"
	String REMOVE_USER = "user/remove"; //DELETE
	
		
	String GET_RECORD = "/recored"; //GET	
	String GET_RECORD_BY_MACHINE = "/record/by_machine"; //GET
	String COMPLITE_RECORD = "/record/complite"; //POST
	String RECORD_BY_PERIOD = "/record/by_period"; //GET
	
	String ADD_MACHINE = "/machine"; //POST
	String UPDATE_MACHINE = "machine/update"; //POST
	String GET_MACHINE = "/machine"; //GET
	String REMOVE_MACHINE = "/machine"; //DELETE
	String GET_MACHINE_STATE = "/machine/state"; //GET
	
	String ADD_PRODUCT = "/product"; //POST
	String GET_PRODUCT = "/product"; //GET
	String REMOVE_PRODUCT = "/product"; //DELETE
	String UPDATE_PRODUCT = "/product/update"; //POST
	String FL_IN_USE_PRODUCT = "/product/fl_in_use"; //GET maybe make POST, to put true or false
	String GET_ALL_PRODUCTS = "/product/all"; //GET
	
	String GET_INCOME_BY_PERIOD = "/stat/income/by_period"; //GET
	String GET_AVG_PROFIT = "/stat/profit/avg/by_period"; // GET
	String GET_MACHINE_AVG_PROFIT = "/stat/profit/avg" ; // GET   +  "/{machineId:int}/by_period" 
	String GET_MONTHLY_MACHINE_PROFIT_BY_PERIOD = "/stat/profit/mothly"; // GET   +  "/{machineId:int}/by_period" 
	String GET_PRODUCT_INCOME = "/stat/product/income"; // GET +  "/{productId:int}/by_period"
	String GET_PRODUCT_SELL_COUNT = "/stat/product/sell"; // GET +  "/{productId:int}/by_period"
	String GET_LIST_SELL_PRODUCT = "/stat/product/sell/by_period"; // GET   maybe SELL !!!!!!!!!!!!!!!
	String GET_MOST_PROFIT_PRODUCT = "/stat/product/profit_most/by_period"; //GET
	String GET_LESS_PROFIT_PRODUCT = "/stat/product/profit_less/by_period"; //GET
	String GET_MOST_SELL_COUNT_PRODUCTS = "/stat/product/count_most/by_period"; //GET  maybe change name function to getMostSellCountProducts
	String GET_LESS_SELL_COUNT_PRODUCTS = "/stat/product/count_less/by_period"; //GET  maybe change name function to getLessSellCountProducts
	String GET_SERVICE_FRIQUENCY = "/stat/machine/friquency"; // GET   +  "/{machineId:int}/by_period" 
	String GET_MACHINE_DOWNTIME_IN_YEAR = "/stat/machine/downtime"; //GET need change broke_time to downtime
	String GET_CURRENT_PRODUCT_STATE_IN_MACHINE = "/stat/product/current"; //GET maybe + "?product_id={product_id:int} ande change method name
	

}
