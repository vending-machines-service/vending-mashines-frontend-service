package telran.vending.frontend.recordservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/record")
public class RecordController {
	
	@Autowired
	CurrenntMalFunctionRepository curMalFunctionRepo;
	@Autowired
	CurrentMaintenanceRepository curMainRepo;
	@Autowired
	ArchiveMalfunctionRecordRepository arMalFRepo;
	@Autowired
	ArchiveMaintenanceRepository arMainRepo;

}
