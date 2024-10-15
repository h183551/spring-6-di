package guru.springframework.spring6di.services.MultiOpSysEbvAssignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Qa")
@Service("multiEnvService")
public class OpEnvServiceQa implements OpEnvService {

    @Override
    public String sayOpSysName(){
        return "Qa";
    }
}