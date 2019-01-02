package vms.vmsfrontendutilityserver.machines;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vms.vmsfrontendutilityserver.dto.ApiConstants;

@RestController
@RequestMapping(ApiConstants.MACHINES)
public class MachinesController {

  @Autowired
  MachinesSqlRepository SQLRepo;

  @Autowired
  MachinesStateMongoRepository MongoRepo;

}
