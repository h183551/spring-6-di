package guru.springframework.spring6di.controllers.MultiOpSysEnvAssignment;

import guru.springframework.spring6di.services.MultiOpSysEbvAssignment.OpEnvService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class OpEnvController {

    private final OpEnvService opEnvService;

    public OpEnvController(@Qualifier("multiEnvService") OpEnvService opEnvService) {
        this.opEnvService = opEnvService;
    }

    public String sayOpSysEnv(){
        return opEnvService.sayOpSysName();
    }
}
