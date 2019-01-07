package vms.vmsfrontendutilityserver.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vms.vmsfrontendutilityserver.dto.ApiConstants;

@RestController
@RequestMapping(ApiConstants.STATISTICS)
public class StatisticsController {
	@Autowired
	StatisticsService service;
	
	

}
