package telran.vending.frontend.machineservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/machine")
public class MachineController {
	
	@Autowired
	MachineSQLRepository SQLRepo;
	
	@Autowired
	MachineStateMongoRepository MongoRepo;

}
